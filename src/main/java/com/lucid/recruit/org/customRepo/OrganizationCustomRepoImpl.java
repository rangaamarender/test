package com.lucid.recruit.org.customRepo;
import com.lucid.recruit.org.entity.Organization;
import com.lucid.util.ServiceUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component(OrganizationCustomRepoImpl.CUSTOM_REPO)
public class OrganizationCustomRepoImpl implements OrganizationCustomRepo {
    public static final String CUSTOM_REPO="organizationCustomRepo";

    private static final String PAGE="page";
    private static final String SIZE="size";
    private static final String SORT="sort";


    @Autowired
    private EntityManager entityManager;
    @Override
    public Page<Organization> fetchOrganizationsWithCriteria(Map<String, Object> filterData){
            Pageable pageable = ServiceUtils.getPageableObject(filterData);
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Organization> query = builder.createQuery(Organization.class);
            Root<Organization> root = query.from(Organization.class);
            List<Predicate> predicates = new ArrayList<>();
            Predicate finalPredicate = null;
            Set<String> exceptFilterValues = Set.of(PAGE,SIZE,SORT);
            if(filterData != null) {
                for (Map.Entry<String, Object> entry : filterData.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!exceptFilterValues.contains(key) && value instanceof String) {
                        predicates.add(builder.like(root.get(key), "%" + value + "%"));
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
            TypedQuery<Organization> typedQuery = entityManager.createQuery(query);
            typedQuery.setFirstResult(pageable.getPageNumber() * pageable.getPageSize());
            typedQuery.setMaxResults(pageable.getPageSize());

            CriteriaQuery<Long> countQuery = builder.createQuery(Long.class);
            countQuery.select(builder.count(countQuery.from(Organization.class)));
            if(finalPredicate != null) {
                countQuery.where(finalPredicate);
            }
            Long totalCount = entityManager.createQuery(countQuery).getSingleResult();

            Page<Organization> page = new PageImpl<>(typedQuery.getResultList(), pageable, totalCount);
            return page;
    }

}
