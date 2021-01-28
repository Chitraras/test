package com.css.corejava.overload;

import java.util.Arrays;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private double balance=1000;
	private BankAccount[] bankAccount;
	public BankAccount[] getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount[] bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance
				+ ", Accounts=" +  "]";
	}
	
	
	


	

}
