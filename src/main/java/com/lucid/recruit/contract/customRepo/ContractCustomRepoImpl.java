package com.lucid.recruit.contract.customRepo;

import com.lucid.recruit.contract.entity.Contract;
import com.lucid.util.ServiceUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component(ContractCustomRepoImpl.CUSTOM_REPO)
public class ContractCustomRepoImpl implements ContractCustomRepo{
    public static final String CUSTOM_REPO="contractCustomRepo";

    private static final String PAGE="page";
    private static final String SIZE="size";
    private static final String SORT="sort";


    @Autowired
    private EntityManager entityManager;
    @Override
    public Page<Contract> fetchContractsWithCriteria(Map<String, Object> filterData) {
        Pageable pageable = ServiceUtils.getPageableObject(filterData);
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Contract> query = builder.createQuery(Contract.class);
        Root<Contract> root = query.from(Contract.class);
        List<Predicate> predicates = new ArrayList<>();
        Predicate finalPredicate = null;
        Set<String> exceptFilterValues = Set.of(PAGE, SIZE, SORT);
        if (filterData != null) {
            for (Map.Entry<String, Object> entry : filterData.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                System.out.println(key);
                if (!exceptFilterValues.contains(key) && value instanceof String) {
                    predicates.add(builder.like(root.get(key), "%" +(String)value + "%"));
                }
            }
            finalPredicate = builder.and(predicates.toArray(new Predicate[predicates.size()]));
            query.where(finalPredicate);
            if (filterData.containsKey(SORT)) {
                Sort sort = pageable.getSort();
                if (sort != null) {
                    List<Order> orders = new ArrayList<>();
                    for (Sort.Order sortOrder : sort) {
                        if (sortOrder.getDirection() == Sort.Direction.ASC) {
                            orders.add(builder.asc(root.get(sortOrder.getProperty())));
                        } else {
                            orders.add(builder.desc(root.get(sortOrder.getProperty())));
                        }
                    }
                    query.orderBy(orders);
                }
            }
        }
        TypedQuery<Contract> typedQuery = entityManager.createQuery(query);
        typedQuery.setFirstResult(pageable.getPageNumber() * pageable.getPageSize());
        typedQuery.setMaxResults(pageable.getPageSize());

        CriteriaQuery<Long> countQuery = builder.createQuery(Long.class);
        countQuery.select(builder.count(countQuery.from(Contract.class)));
        if (finalPredicate != null) {
            countQuery.where(finalPredicate);
        }
        Long totalCount = entityManager.createQuery(countQuery).getSingleResult();

        Page<Contract> page = new PageImpl<>(typedQuery.getResultList(), pageable, totalCount);
        return page;
    }

}
