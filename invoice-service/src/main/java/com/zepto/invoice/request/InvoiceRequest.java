package com.zepto.invoice.request;

public class InvoiceRequest {

	private int invValue;
	private String note;
	private String gstNo;
	private String status;
	private String description;

	public int getInvValue() {
		return invValue;
	}

	public void setInvValue(int invValue) {
		this.invValue = invValue;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
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
