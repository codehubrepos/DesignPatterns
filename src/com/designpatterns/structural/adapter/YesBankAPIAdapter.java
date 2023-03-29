package com.designpatterns.structural.adapter;

import java.math.BigDecimal;

public class YesBankAPIAdapter implements BankAPI{

	YesBankAPI yesBankAPI = new YesBankAPI();
	
	@Override
	public BigDecimal checkBalance() {
		BigDecimal balance = new BigDecimal(yesBankAPI.checkBal());
		return balance;
	}

	@Override
	public boolean pinValidation() {
		return yesBankAPI.pinValid();
	}

	@Override
	public boolean transactionStatus() {
		return yesBankAPI.transactionSts();
	}


}
