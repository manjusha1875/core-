package com.javafirstclass;

public class Bankaccount1 {
int accno;
String customername;
String accounttype;
double balance;

Bankaccount1(int accno,String customername,String accounttype,double balance ){
	this.accno=accno;
	this.customername=customername;
	this.accounttype=accounttype;
	this.balance=balance;
	
}
void display() {
	System.out.println("accno:"+accno);
	System.out.println("customername:"+customername);
	System.out.println("accounttype:"+accounttype);
	System.out.println("balance:"+balance);
	System.out.println();
}

	public static void main(String[] args) {
		Bankaccount1 b1 =new Bankaccount1(7714,"manju","saving",25000);
		Bankaccount1 b2 =new Bankaccount1(40,"anju","current",20000);
		b1.display();
		b2.display();
	}

}
