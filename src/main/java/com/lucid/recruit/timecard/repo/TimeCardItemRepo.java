package com.lucid.recruit.timecard.repo;

import com.lucid.recruit.timecard.entity.TimeCardItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeCardItemRepo extends JpaRepository<TimeCardItem,String> {
}
