package com.javafirstclass;

public class bankaccount {
int accno;
String accountholdername;
double balance;

static int accountnogenerator=1000;
{
	accountnogenerator++;
	accno = accountnogenerator;
}
public static void main(String[]args) {
	bankaccount b1 =new bankaccount();
	b1.accountholdername="anju";
	b1.balance= 5000;
	
	bankaccount b2 =new bankaccount();
	b2.accountholdername="aju";
	b2.balance= 6000;
	
	
	bankaccount b3 =new bankaccount();
	b3.accountholdername="nju";
	b3.balance= 7000;
	
	
	
	System.out.println("account no:"+b1.accno);
	System.out.println("accountholdername:"+b1.accountholdername);
	System.out.println("balance:"+b1.balance);
	
	
	System.out.println("account no:"+b2.accno);
	System.out.println("accountholdername:"+b2.accountholdername);
	System.out.println("balance:"+b2.balance);
	
	
	System.out.println("account no:"+b3.accno);
	System.out.println("accountholdername:"+b3.accountholdername);
	System.out.println("balance:"+b3.balance);
	
	
}
}
