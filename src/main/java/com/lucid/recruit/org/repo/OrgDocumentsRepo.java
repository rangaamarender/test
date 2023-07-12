package com.lucid.recruit.org.repo;

import com.lucid.recruit.org.entity.OrgDocuments;
import com.lucid.recruit.org.entity.OrganizationDocument;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgDocumentsRepo extends JpaRepository<OrgDocuments,String> {

}
