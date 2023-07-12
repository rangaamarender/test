package com.lucid.recruit.person.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucid.recruit.person.entity.PersonContactDetails;

/**
 * 
 * @author chandu
 *
 */
public interface PersonContactDetailsRepo extends JpaRepository<PersonContactDetails, String> {

}
