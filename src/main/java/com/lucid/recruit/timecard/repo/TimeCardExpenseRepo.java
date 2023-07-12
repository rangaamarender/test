package com.lucid.recruit.timecard.repo;

import com.lucid.recruit.timecard.entity.TimeCardExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeCardExpenseRepo extends JpaRepository<TimeCardExpense,String> {
}
