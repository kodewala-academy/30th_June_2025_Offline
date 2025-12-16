package com.sbi.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.banking.request.TransferRequest;
import com.sbi.banking.service.FundTransferService;

@RestController
public class FundTransferController {

	@Autowired
	FundTransferService fundTransferService;

	@PostMapping("tranferMoney")
	public String transferFund(@RequestBody TransferRequest request) {
		String response = fundTransferService.doFundTransfer(request);
		return response;
	}
}
