package com.lucid.recruit.contract.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lucid.recruit.contract.entity.ContractResource;

public interface ContractResourceRepo extends JpaRepository<ContractResource, String> {


	@Query("select cr from ContractResource cr JOIN cr.workOrder ccw where "
			+ "cr.workOrder.workOrderID =:woid and cr.worker.workerID =:wid and "
			+ "ccw.startDate<=:tsstartdt and ((ccw.endDate is null) or (ccw.endDate >=:tsenddt))")
	public List<ContractResource> findByWoDates(@Param("wid") String workerId, @Param("woid") String workOrderID,
			@Param("tsstartdt") LocalDate tsStartDt, @Param("tsenddt") LocalDate tsEndDate);

}
