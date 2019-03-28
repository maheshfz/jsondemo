package com.reader.json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class PurchaseOrederReader {

	 int m=90;
	int j=0;
	
	public int getQuantity(String inFile) throws FileNotFoundException {
	
		   File jsonInputFile = new File(inFile);
	      
		   InputStream is=new FileInputStream(jsonInputFile);
            	
	        JsonReader jsonreader=Json.createReader(is);
	        
	        JsonObject jsonObject=jsonreader.readObject();
	        JsonArray array=jsonObject.getJsonArray("orderItems");
	        int quantity=0; 
	        for(int i=0;i<array.size();i++) {
	        	
	        	JsonObject itemObject=array.getJsonObject(i);
	        	 
	        	
	        	 
	        	quantity=quantity+itemObject.getInt("quantity");
	        	
	        	 
	         }
	         
	 
	
	
	
	return quantity;
	
	
	}
	
}
