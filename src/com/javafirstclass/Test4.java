package com.javafirstclass;  //--private:-accessible only within the same class.

  class Test4 {
  int add(int a, int b) {
	  return a+b;
  }
  double Average(double a,double b) {
	  return (a+b)/2;
  }
  String getName() {
	  return "Manju";
  }
  public static void main(String [] args) {
	  Test4 t = new Test4();
	  System.out.println("sum:"+t.add(10,20));
	  System.out.println("Average:"+t.Average(10,20));
	  System.out.println("Name:"+t.getName());

  }
  }

   

