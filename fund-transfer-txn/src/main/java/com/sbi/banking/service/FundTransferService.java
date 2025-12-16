package com.sbi.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.banking.entity.Account;
import com.sbi.banking.repository.FundTransferRepo;
import com.sbi.banking.request.TransferRequest;

import jakarta.transaction.Transactional;

@Service
public class FundTransferService {

	@Autowired
	FundTransferRepo fundTransferRepo;

	@Transactional
	public String doFundTransfer(TransferRequest tr) {
		int amountToBeTrans = tr.getAmount();

		String fromAccountNumber = tr.getFromAccount();
		Account fromAccount = fundTransferRepo.findByAccountNo(fromAccountNumber);
		fromAccount.setBalance(fromAccount.getBalance() - amountToBeTrans);

		fundTransferRepo.save(fromAccount);

		String s1 = null;
		s1.length();

		String toAccountNumber = tr.getToAccount();
		Account toAccount = fundTransferRepo.findByAccountNo(toAccountNumber);
		toAccount.setBalance(toAccount.getBalance() + amountToBeTrans);

		fundTransferRepo.save(toAccount);

		return "Fund has been transferred successfully.....";
	}
}
