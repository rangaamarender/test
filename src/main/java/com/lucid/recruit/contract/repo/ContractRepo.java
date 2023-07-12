package com.lucid.recruit.contract.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucid.recruit.contract.entity.Contract;

public interface ContractRepo extends JpaRepository<Contract, String> {

}
