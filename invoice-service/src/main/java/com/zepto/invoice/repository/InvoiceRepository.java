package com.zepto.invoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zepto.invoice.entity.InvoiceEntity;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Integer> {
  // CRUD --> Create , Read , Updste and Delete
	
	// save --> insert the record
	// findby Id
	// select * from payment table where status ='PAID' 
	// findByStatus(String status) --> select * from payment  where status ='PAID'
	
	List<InvoiceEntity> findInvoiceByStatus(String status);
	
	 
}
