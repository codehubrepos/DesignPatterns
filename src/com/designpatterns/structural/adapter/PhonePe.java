package com.designpatterns.structural.adapter;

public class PhonePe {

	public static void main(String[] args) {
		BankAPI bankAPI = new YesBankAPIAdapter();
		//BankAPI bankAPI = new ICICIBankAPIAdapter();
		bankAPI.checkBalance();
		bankAPI.pinValidation();
		bankAPI.transactionStatus();

	}

}
