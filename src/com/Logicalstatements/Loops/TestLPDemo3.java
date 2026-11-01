package com.Logicalstatements.Loops;


import java.math.BigInteger;
public class TestLPDemo3 {
	


	    public static void main(String[] args) {

	        System.out.println("main method started");

	        for (BigInteger i = BigInteger.ZERO;
	             i.compareTo(BigInteger.TEN) <= 0;
	             i = i.add(BigInteger.ONE)) {

	            System.out.println(i);
	        }
	    }
	}

