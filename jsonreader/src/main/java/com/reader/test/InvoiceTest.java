package com.reader.test;

import java.io.FileNotFoundException;

import com.writer.bean.Consignment;
import com.writer.bean.Invoice;
import com.writer.tojson.InvoiceWriter;

public class InvoiceTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		InvoiceWriter invoiceWriter=new InvoiceWriter();
		Invoice invoice=new Invoice();
		invoice.setInvoiceNo(12);
		invoice.setAmount(230.002);
		invoice.setDistributerName("rekha graphics");
	
		
		
		  
		   
		   
		
		
		
		 invoiceWriter.toJson(invoice, "D:\\invoice.json");
		
		System.out.println("success");

	}

}
