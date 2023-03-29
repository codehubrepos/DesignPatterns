package com.designpatterns.structural.adapter;

public class YesBankAPI {

	public double checkBal() {
		System.out.println("Yes Bank Check Balance");
		return 0.0;
	}
	
	public boolean pinValid() {
		System.out.println("Yes Bank Pin Validation");
		return true;
	}
	
	public boolean transactionSts() {
		System.out.println("Yes Bank Transaction Status");
		return true;
	}
}
