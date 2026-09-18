package com.javafirstclassMethods;

public class BankAccount {
	static int balance=1000;
    void deposit(int amount) {
    	System.out.println("deposit balance:"+amount);
    	
    balance = balance + amount;
    }
    void withdraw(int amount) {
    	System.out.println("withdraw amount:"+amount);
    	balance = balance - amount;
    }
    
	public static void main(String[] args) {
	BankAccount B1=new BankAccount();
	B1.deposit (500);
	B1.withdraw(300);
System.out.println("final balance:"+balance);
	}

}
