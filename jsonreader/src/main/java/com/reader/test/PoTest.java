package com.reader.test;

import java.io.FileNotFoundException;

import com.reader.json.PurchaseOrederReader;

public class PoTest {

	public static void main(String[] args) throws FileNotFoundException {
	
		PurchaseOrederReader po=new PurchaseOrederReader();
		int quantity=po.getQuantity("src/main/resources/purchaseOreder.json");
		System.out.println("quantity: "+quantity);

	}

}
