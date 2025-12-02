package com.zepto.payment.request;

public class PaymentRequest {

	private String paymentRefNo;
	private String orderId;
	private String amount;
	private String status;
	private String description;
	public String getPaymentRefNo() {
		return paymentRefNo;
	}
	public void setPaymentRefNo(String paymentRefNo) {
		this.paymentRefNo = paymentRefNo;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
