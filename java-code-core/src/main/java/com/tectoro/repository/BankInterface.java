package com.tectoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.entity.Bank;
@Repository
public interface BankInterface extends JpaRepository<Bank, Integer> {

}
