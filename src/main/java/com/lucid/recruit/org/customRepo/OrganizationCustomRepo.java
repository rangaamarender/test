package com.lucid.recruit.org.customRepo;

import com.lucid.core.base.BaseCustomRepo;
import com.lucid.recruit.contract.entity.Contract;
import com.lucid.recruit.org.entity.Organization;
import org.springframework.data.domain.Page;

import java.util.Map;

public interface OrganizationCustomRepo extends BaseCustomRepo {
    Page<Organization> fetchOrganizationsWithCriteria(Map<String,Object> filterData);
}
