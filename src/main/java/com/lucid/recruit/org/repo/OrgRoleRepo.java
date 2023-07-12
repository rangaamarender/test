package com.lucid.recruit.org.repo;

import com.lucid.recruit.org.entity.OrgRole;
import com.lucid.recruit.org.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface OrgRoleRepo extends JpaRepository<OrgRole,String> {

}
