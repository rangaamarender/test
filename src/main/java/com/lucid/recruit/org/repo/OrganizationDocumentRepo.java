package com.lucid.recruit.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lucid.recruit.org.entity.OrganizationDocument;
import jakarta.transaction.Transactional;

public interface OrganizationDocumentRepo extends JpaRepository<OrganizationDocument,String> {

	@Transactional
	@Modifying
	@Query(value="UPDATE o_org_doc SET  org_id=:organizationID  WHERE Organization_doc_id=:organizationDocID",nativeQuery = true)
	void updateOrgDocs( String organizationID, String organizationDocID);

}
