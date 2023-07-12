package com.lucid.recruit.contract.customRepo;

import com.lucid.core.base.BaseCustomRepo;
import com.lucid.recruit.contract.entity.Contract;
import org.springframework.data.domain.Page;

import java.util.Map;

public interface ContractCustomRepo extends BaseCustomRepo {
    Page<Contract> fetchContractsWithCriteria(Map<String,Object> filterData);
}
