package com.css.corejava.overload;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		BankAccount Acc= new BankAccount("123456789","chitrarasu");
		System.out.println("Account Holder name: "+Acc.getAccountName());
		System.out.println("Account Number: "+Acc.getAccountNo());
		System.out.println("Account Balance: "+Acc.getBalance());
	}

}
