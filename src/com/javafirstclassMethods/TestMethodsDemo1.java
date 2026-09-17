package com.javafirstclassMethods;

public class TestMethodsDemo1 {

    void add(int a,int b) {
    	
    	System.out.println(a + b );
    
    }
    void m2(int a, int b) {
    	int c=a-b;
    	System.out.println(a - b);
    }
    void m3(int a, int b) {
    	int c =a*b;
    	System.out.println(a*b);
    }
    void m4(int a, int b) {
    	int c=a/b;
    	System.out.println(a/b);
    }
    void m5(int a,int b) {
    	int c=a % b;   
    	System.out.println(a%b);
    }
    void m6(int a, int b) {
    	System.out.println("a>b");
    }

    void m7(int a, int b) {
    	System.out.println("a>=b");
    }
    

    void m8(int a, int b) {
    	System.out.println("a<b");
    }
    

    void m9(int a, int b) {
    	System.out.println("a!=b");
    }
	public static void main(String[] args) {
		 System.out.println("main method started");
		 TestMethodsDemo1 T1 = new  TestMethodsDemo1 ();
		 T1.add(10,20);
		 
		 TestMethodsDemo1 T2 = new  TestMethodsDemo1 ();
		 T2.m2(10,20);
		 
		 TestMethodsDemo1 T3 = new  TestMethodsDemo1 ();
		 T3.m3(10,20);
		 
		 TestMethodsDemo1 T4 = new  TestMethodsDemo1 ();
		 T4.m3(100,2);
		 
		 TestMethodsDemo1 T5 = new  TestMethodsDemo1 ();
		 T5.m3(10,2);
		 
		 TestMethodsDemo1 T6 = new  TestMethodsDemo1 ();
		 T6.m3(100,20);

		 TestMethodsDemo1 T7 = new  TestMethodsDemo1 ();
		 T6.m3(100,20);
		 
		 TestMethodsDemo1 T8 = new  TestMethodsDemo1 ();
		 T6.m3(1,20);
		 
		 TestMethodsDemo1 T9 = new  TestMethodsDemo1 ();
		 T6.m3(10,20);
		 System.out.println("main method ended");
	}
		

}

		
	
