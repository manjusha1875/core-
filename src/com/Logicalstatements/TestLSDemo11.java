package com.Logicalstatements;

import java.util.Scanner;


//switch case poc : Nested switch
//WAPoc REalted Restaurant orders : Invoice Management
public class TestLSDemo11 {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
String yn="";
double total_price=0;

  do {
	  System.out.println("Enter veg/non-veg/starters/drinks :");
	  String catg =sc.next();
	  switch (catg) {
	  
	   
	   
	  case "Veg"->{
		  String vyn ="";
		  double veg_total_price =0;

		  do {
			  System.out.println("Enter the Item:");
			  String veg_item =sc.next();
			  
			  switch(veg_item) {
			  
			  case "pbm" ->{
				  System.out.println("PBM paneer butter Masala -price:250/-rs");
				  double pbm_price =250;
				  veg_total_price += pbm_price; 
			  }
			  case "dal" ->{
				  System.out.println("Dal Tadaka -price:200/-rs");
				  double dal_price =250;
				  veg_total_price += dal_price; 
			  }
			 
				case "pvm" -> {
				    System.out.println("Paneer Tikka Masala - price: 280/- Rs");
				    double pvm_price = 280;
				    veg_total_price += pvm_price;
				}

				case "matar" -> {
				    System.out.println("Matar Paneer - price: 240/- Rs");
				    double matar_price = 240;
				    veg_total_price += matar_price;
				}

				case "chole" -> {
				    System.out.println("Chole Masala - price: 180/- Rs");
				    double chole_price = 180;
				    veg_total_price += chole_price;
				}

				case "kadai" -> {
				    System.out.println("Kadai Paneer - price: 260/- Rs");
				    double kadai_price = 260;
				    veg_total_price += kadai_price;
				}

				case "palak" -> {
				    System.out.println("Palak Paneer - price: 230/- Rs");
				    double palak_price = 230;
				    veg_total_price += palak_price;
				}

				case "mixveg" -> {
				    System.out.println("Mixed Vegetable Curry - price: 190/- Rs");
				    double mixveg_price = 190;
				    veg_total_price += mixveg_price;
				}

				case "aloo" -> {
				    System.out.println("Aloo Gobi - price: 170/- Rs");
				    double aloo_price = 170;
				    veg_total_price += aloo_price;
				}

				case "mushroom" -> {
				    System.out.println("Mushroom Masala - price: 220/- Rs");
				    double mushroom_price = 220;
				    veg_total_price += mushroom_price;
				
				}
		  
		    default ->System.out.println("Enter item is not avaible");

		  }
			  
		  System.out.println("Do you want to continue with the veg Items:click Y for yes N for No");
		  vyn =sc.next();
		  }while(vyn.equalsIgnoreCase("y"));
System.out.println("Veg Total price is:"+ veg_total_price);
total_price+=veg_total_price;
	  }
	 
	  	
	case "Non-Veg"->{
		 String nvyn ="";
		  double non_veg_total_price =0;
		  
		 do {
			 System.out.println("Enter the Item:");
			  String non_veg_item =sc.next();
			  
			  switch(non_veg_item) {
			  
			  case "mdb" ->{
				  System.out.println("Mutton Dum Biryani :price is :500/-rs");
				  double mdb_price= 500;
				  non_veg_total_price +=mdb_price;
			  }
			  
			  case "chb" -> {
				    System.out.println("Chicken Dum Biryani : price is : 350/-rs");
				    double chb_price = 350;
				    non_veg_total_price += chb_price;
				}

				case "mgb" -> {
				    System.out.println("Mutton Gongura Biryani : price is : 550/-rs");
				    double mgb_price = 550;
				    non_veg_total_price += mgb_price;
				}

				case "prawnb" -> {
				    System.out.println("Prawn Biryani : price is : 450/-rs");
				    double prawnb_price = 450;
				    non_veg_total_price += prawnb_price;
				}

				case "eggb" -> {
				    System.out.println("Egg Biryani : price is : 250/-rs");
				    double eggb_price = 250;
				    non_veg_total_price += eggb_price;
				}

				case "fishb" -> {
				    System.out.println("Fish Biryani : price is : 400/-rs");
				    double fishb_price = 400;
				    non_veg_total_price += fishb_price;
				}

				case "ch65" -> {
				    System.out.println("Chicken 65 : price is : 300/-rs");
				    double ch65_price = 300;
				    non_veg_total_price += ch65_price;
				}

				case "chillch" -> {
				    System.out.println("Chilli Chicken : price is : 320/-rs");
				    double chillch_price = 320;
				    non_veg_total_price += chillch_price;
				}

				case "chmaj" -> {
				    System.out.println("Chicken Majestic : price is : 350/-rs");
				    double chmaj_price = 350;
				    non_veg_total_price += chmaj_price;
				}

				case "tikka" -> {
				    System.out.println("Chicken Tikka : price is : 330/-rs");
				    double tikka_price = 330;
				    non_veg_total_price += tikka_price;
				}

				case "fishfry" -> {
				    System.out.println("Fish Fry : price is : 280/-rs");
				    double fishfry_price = 280;
				    non_veg_total_price += fishfry_price;
				}
				
				default ->System.out.println("Entered item is not availble");
			  }
			System.out.println("Do you want continue with Non-veg items..? click Y for yes N for no ");
			nvyn =sc.next();
		 }while(nvyn.equalsIgnoreCase("y"));
		 
		 System.out.println("Non-veg Total price is:"+non_veg_total_price );
		 total_price+=non_veg_total_price;
		 
	  }
	
	default ->System.out.println("enter category is not availble");
	  }
	  
	  System.out.println("Do you want to continue click y for yes N for no..?");
	  yn = sc.next();
	  
  }while (yn.equalsIgnoreCase("y"));
  
  System.out.println("Total price:"+ total_price);
  
	}

}
