package com.lucid.recruit.timecard.repo;

import com.lucid.recruit.timecard.entity.TimeCardExpenseDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeCardExpenseDocumentRepo extends JpaRepository<TimeCardExpenseDocument,String> {
}
