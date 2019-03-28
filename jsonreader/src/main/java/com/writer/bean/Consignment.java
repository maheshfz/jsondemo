package com.writer.bean;

public class Consignment {

	 protected int consignementNo;
	 protected String awbNo;
	
	 
	 
	 
	 public Consignment(int consignementNo, String awbNo) {
		
		this.consignementNo = consignementNo;
		this.awbNo = awbNo;
	}
	public int getConsignementNo() {
		return consignementNo;
	}
	public void setConsignementNo(int consignementNo) {
		this.consignementNo = consignementNo;
	}
	public String getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	 
	 
	
	
}
