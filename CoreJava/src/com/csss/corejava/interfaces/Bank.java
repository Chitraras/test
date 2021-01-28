package com.csss.corejava.interfaces;

import java.util.Arrays;

public class Bank {
	
	private BankAccount[] bankAccount;

	@Override
	public String toString() {
		return "Bank [bankAccount=" + Arrays.toString(bankAccount) + "]";
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(BankAccount[] bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	public BankAccount[] getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount[] bankAccount) {
		this.bankAccount = bankAccount;
	}
	
		
	
	

}
