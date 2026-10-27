package com.Logicalstatements;

public class TestDemo3 {

	public static void main(String[] args) {
		
    int a =10;
    int b =20;
    int temp;
    
    System.out.println("Before swapping");
    System.out.println("a ="+a);
    System.out.println("b ="+b);
    
    temp =a;
        a =b;
        b = a;
    
        System.out.println("After swapping");
        System.out.println("a ="+a);
        System.out.println("b ="+b);


	}

}
