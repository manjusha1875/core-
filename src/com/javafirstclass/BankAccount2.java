package com.javafirstclass;

public class BankAccount2 {
int accountnumber;
String accountholdername;
double balance;
String branch;

//parameterized
BankAccount2(int accountnumber,String accountholdername,double balance,String branch){
	this.accountnumber=accountnumber;
	this.accountholdername=accountholdername;
	this.balance=balance;
	this.branch=branch;
}
//copy constructor
BankAccount2(BankAccount2 obj){
	this.accountnumber=obj.accountnumber;
	this.accountholdername=obj.accountholdername;
	this.balance=obj.balance;
	this.branch=obj.branch;
}
//display method
void displayAccountdetails() {
	System.out.println("accountnumber:"+accountnumber);
	System.out.println("accountholdername:"+accountholdername);
	System.out.println("balance:"+balance);
	System.out.println("branch:"+branch);
	System.out.println();

}
public static void main(String[] args) {
//original object
	BankAccount2 account1=new BankAccount2(7714,"manju",200000,"SBI");
	
	//copy object
	BankAccount2 account2=new BankAccount2(account1);
	
	//change copied account
	 account2.branch="KPHB";
	 account2.balance=30000;
	 
	 //display both account
	 System.out.println("original account:");
	 
	 account1.displayAccountdetails();
	 System.out.println("copied account");
	 account2.displayAccountdetails();
	}

}
