package com.javafirstclass;

public class Product {
	int productId;
	String productName;
	Double price;
	int Quantity;


   Product(int productId,String productName, int Quantity,double price ){
	this.productId=productId;
	this.productName=productName;
	this.price = price;
	this.Quantity=Quantity;
}
   Product(Product P){
	   this.productId=P.productId;
		this.productName=P.productName;
		this.price=P.price;
		this.Quantity=P.Quantity;
   }

		double CalculateTotal() {
			return price * Quantity;
		}
   
void display() {
	System.out.println("ProductID : "+ productId);
	System.out.println("ProductName : "+ productName);
	System.out.println("Productprice : "+ price);
	System.out.println("ProductQuantity : "+ Quantity);
	System.out.println("Total Price:"+CalculateTotal());
	System.out.println();
}
	public static void main(String[] args) {
		Product Product1=new Product(40, "Phone",64,20000);
		Product Product2=new Product(Product1);
		Product2.Quantity=4;
		System.out.println("Product1 Details:");
		Product1.display();
		System.out.println("Product2 Details:");
		Product2.display();
	}
	}


		
		
		
		

	
