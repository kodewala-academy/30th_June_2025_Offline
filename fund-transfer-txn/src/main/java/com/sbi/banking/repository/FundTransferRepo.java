package com.sbi.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.banking.entity.Account;

@Repository
public interface FundTransferRepo extends JpaRepository<Account, Integer> {

	public Account findByAccountNo(String accountNo);
}
