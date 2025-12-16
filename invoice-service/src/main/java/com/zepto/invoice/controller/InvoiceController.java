package com.zepto.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.invoice.entity.InvoiceEntity;
import com.zepto.invoice.request.InvoiceRequest;
import com.zepto.invoice.service.InvoiceService;

@RestController
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;

	@PostMapping("generateInvoice")
	public String generateInvoice(@RequestBody InvoiceRequest invoiceRequest) {
		int invId = invoiceService.createInvoice(invoiceRequest);
		return " You invoice has been generated successfully. Invoice id is : " + invId;
	}

	@GetMapping("/getInv/{status}")
	public String findInvByStatus(@PathVariable String status) {
		List<InvoiceEntity> invoices = invoiceService.findInvoiceByStatus(status);
		return "You invoice desc is  : " + invoices.get(0).getDescription();
	}

}
