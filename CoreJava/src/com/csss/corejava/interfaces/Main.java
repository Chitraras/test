package com.csss.corejava.interfaces;

import java.util.Arrays;

public class Main {
	public static <setBankAccount> void main(String[] args) {
		BankAccount[] bankAccount= new BankAccount[3];
		bankAccount[0] = new BankAccount();
		bankAccount[1] = new BankAccount();
		bankAccount[2] = new BankAccount();
		bankAccount[0].setAccountHolderName("user1");
		bankAccount[0].setAccountNo("12");
		bankAccount[0].setBalance(1000);
		
		bankAccount[1].setAccountHolderName("user2");
		bankAccount[1].setAccountNo("13");
		bankAccount[1].setBalance(1000);
		
		bankAccount[2].setAccountHolderName("user3");
		bankAccount[2].setAccountNo("14");
		bankAccount[2].setBalance(1000);
		
		System.out.println(bankAccount[0]);
		System.out.println(bankAccount[1]);
		System.out.println(bankAccount[2]);
		
	}

}
