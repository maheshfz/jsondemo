package com.writer.tojson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

import com.writer.bean.Consignment;
import com.writer.bean.Invoice;

public class InvoiceWriter {

	public void toJson(Invoice invoice,String outputfile) throws FileNotFoundException {
		
		 JsonWriter jsonWriter=null;
		 JsonObjectBuilder objectBuilder=null;
		 JsonArrayBuilder arrayBuilder=null;
		 JsonObject jsonObject=null;
		 FileOutputStream os=new FileOutputStream(outputfile);
		
		  jsonWriter=Json.createWriter(os);       
		    objectBuilder=Json.createObjectBuilder(); 
       		   
		   
		 
		   
		   
		   objectBuilder.add("invoiceNo", invoice.getInvoiceNo());
		   objectBuilder.add("distributerName", invoice.getDistributerName());
		   objectBuilder.add("amount", invoice.getAmount());
	  	   objectBuilder.add("consignemnet", arrayBuilder);
		   
		    jsonObject=objectBuilder.build();
		  
		  jsonWriter.writeObject(jsonObject);
	       
	
	}
	
} 
