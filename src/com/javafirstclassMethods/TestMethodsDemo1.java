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
    
    void m10(int width,int length) {
    	System.out.println("Area:"+width * length);
    }
    void m11(int circle) {
    	System.out.println("circle:");
    }
    void age() {
    	System.out.println("age:"+21);
    	
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
		 T6.m3(100,20);
		 
		 TestMethodsDemo1 T10 = new  TestMethodsDemo1 ();
		 T6.m3(1000,20);
		 
		 TestMethodsDemo1 T11 = new  TestMethodsDemo1 ();
		 T6.m3(11,20);
		 
		 TestMethodsDemo1 T12 = new  TestMethodsDemo1 ();
		 T6.m3(21,20);

		 TestMethodsDemo1 T13 = new  TestMethodsDemo1 ();
		 T6.m3(21,20);
		 

		 TestMethodsDemo1 T14 = new  TestMethodsDemo1 ();
		 T7.m6(21,2);
		 
		 System.out.println("main method ended");
	}
		

}

		
	
