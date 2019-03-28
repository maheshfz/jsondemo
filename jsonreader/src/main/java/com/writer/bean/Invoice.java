package com.writer.bean;

import java.util.List;

public class Invoice  {

	protected int invoiceNo;
	protected String distributerName;
	protected double amount;
   	
	
	
	


	
	/*public Invoice(int invoiceNo, String distributerName, double amount, Consignment[] consignemnt) {
		super();
		this.invoiceNo = invoiceNo;
		this.distributerName = distributerName;
		this.amount = amount;
		this.consignemnt = consignemnt;
	}*/
	
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getDistributerName() {
		return distributerName;
	}
	public void setDistributerName(String distributerName) {
		this.distributerName = distributerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
