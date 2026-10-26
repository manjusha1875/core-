package com.operator;

public class TestTernaryOPDemo2 {

	public static void main(String[] args) {
     int a=2;
     int b=3;
     int c=1;
     String  max=(a>b)
			    ?((a>c)?"a is max":"c  is max")
			    :(b>c)?"b is max" : "c is max";
     
    		 System.out.println(max);
    
	}

}
