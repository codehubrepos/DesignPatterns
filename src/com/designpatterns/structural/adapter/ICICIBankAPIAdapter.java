package com.designpatterns.structural.adapter;

import java.math.BigDecimal;

public class ICICIBankAPIAdapter implements BankAPI{

	ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
	
	@Override
	public BigDecimal checkBalance() {
		BigDecimal balance = new BigDecimal(iciciBankAPI.balanceCheck());
		return balance;
	}

	@Override
	public boolean pinValidation() {
		return iciciBankAPI.validPin();
	}

	@Override
	public boolean transactionStatus() {
		return iciciBankAPI.transactionSuccessful();
	}
	

}
