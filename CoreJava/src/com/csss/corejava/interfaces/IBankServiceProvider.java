package com.csss.corejava.interfaces;

public interface IBankServiceProvider {
	public void CheckAccouont(String accountNo);
	public double getBalance(String accounNo,double amount);
	public boolean depositMoney(String accountNo,double amount);
	public boolean withdrawMoney(String accoountNo,double amount);
	public boolean transferMoney(String fromAccountNo,String toAccountNo,double amount);

}
