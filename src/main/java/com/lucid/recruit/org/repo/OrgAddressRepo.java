package com.lucid.recruit.org.repo;

import com.lucid.recruit.org.entity.OrgAddress;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrgAddressRepo extends JpaRepository<OrgAddress,String> {
	
	@Transactional
	@Modifying
	@Query(value="UPDATE o_org_addr SET  organizationid=:orgId  WHERE org_address_id=:orgAddrId",nativeQuery = true)
	void updateOrgAddr(@Param("orgId") String orgId,@Param("orgAddrId")String orgAddrId);
}
