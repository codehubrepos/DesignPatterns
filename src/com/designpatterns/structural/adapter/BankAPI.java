package com.designpatterns.structural.adapter;

import java.math.BigDecimal;

public interface BankAPI {
	
	public BigDecimal checkBalance();
	public boolean pinValidation();
	public boolean transactionStatus();

}
