package com.javafirstclass;  //--private:-accessible only within the same class.

  class Test4 {
  private int a = 10; 

   void display() {
	System.out.println(a);
	}

}
   class Demo{
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.display();
	
}
	}