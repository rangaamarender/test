package com.lucid.recruit.timecard.repo;

import com.lucid.recruit.timecard.entity.TimeCardDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeCardDocumentRepo extends JpaRepository<TimeCardDocument,String> {
}
