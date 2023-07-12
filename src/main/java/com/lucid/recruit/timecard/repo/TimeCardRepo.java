package com.lucid.recruit.timecard.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lucid.recruit.timecard.entity.TimeCard;

public interface TimeCardRepo extends JpaRepository<TimeCard, String> {

	@Query("select tc from TimeCard tc where " + "tc.workOrder.workOrderID =:woid and tc.worker.workerID =:wid and "
			+ "(:tsstartdt between tc.startDate and tc.endDate) or "
			+ "(:tsenddt between tc.startDate and tc.endDate) or "
			+ "(:tsstartdt < tc.startDate and :tsenddt > tc.endDate) or "
			+ "(:tsstartdt > tc.startDate and :tsenddt < tc.endDate)")
	public List<TimeCard> findByWoDates(@Param("wid") String workerId, @Param("woid") String workOrderID,
			@Param("tsstartdt") LocalDate tsStartDt, @Param("tsenddt") LocalDate tsEndDate);
}
