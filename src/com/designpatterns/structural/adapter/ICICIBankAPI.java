package com.designpatterns.structural.adapter;

public class ICICIBankAPI {
	
	public double balanceCheck() {
		System.out.println("ICICI Balance Check");
		return 0.0;
	}
	
	public boolean validPin() {
		System.out.println("ICICI Valid Pin");
		return true;
	}
	
	public boolean transactionSuccessful() {
		System.out.println("ICICI Is Transaction Successful");
		return true;
	}
}
