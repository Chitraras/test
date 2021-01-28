package com.csss.corejava.interfaces;

public class BankAccount {
	private String accountNo;
	private String accountHolderName;
	private double balance;
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(String accountNo, String accountHolderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
