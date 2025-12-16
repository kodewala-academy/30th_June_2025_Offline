package com.zepto.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.invoice.entity.InvoiceEntity;
import com.zepto.invoice.repository.InvoiceRepository;
import com.zepto.invoice.request.InvoiceRequest;

@Service
public class InvoiceService {

	@Autowired
	InvoiceRepository invoiceRepository;

	public int createInvoice(InvoiceRequest invoiceRequest) {
		InvoiceEntity entity = new InvoiceEntity();
		entity.setInvValue(invoiceRequest.getInvValue());
		entity.setGstNo(invoiceRequest.getGstNo());
		entity.setStatus(invoiceRequest.getStatus());
		entity.setNote(invoiceRequest.getNote());
		entity.setDescription(invoiceRequest.getDescription());

		entity = invoiceRepository.save(entity);
		return entity.getInvId();
	}

	public List<InvoiceEntity> findInvoiceByStatus(String status) {
		List<InvoiceEntity> invoices = invoiceRepository.findInvoiceByStatus(status);
		return invoices;
	}

}
