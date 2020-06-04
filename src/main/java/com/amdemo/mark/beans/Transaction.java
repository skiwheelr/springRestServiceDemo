package com.amdemo.mark.beans;

public class Transaction {

	String transactionId;
	String vendor;
	String customerId;
	double amount;
	String date;
	
	String api = "American Express Transaction Services";
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getApi() {
		return api;
	}
	public void setApi(String welcome) {
		this.api = welcome;
	}
	
	
}
