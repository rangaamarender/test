package com.lucid.recruit.timecard.customRepo;

import com.lucid.core.base.BaseCustomRepo;
import com.lucid.recruit.contract.entity.Contract;
import com.lucid.recruit.timecard.entity.TimeCard;
import org.springframework.data.domain.Page;

import java.util.Map;

public interface TimeCardCustomRepo extends BaseCustomRepo {
    Page<TimeCard> fetchTimeCardWithCriteria(Map<String,Object> filterData);
}
