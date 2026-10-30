
package com.Logicalstatements;

import java.util.Scanner;

// Switch case POC : Nested Switch
// WAPoc Related Medical Store : Invoice Management

public class TestLSDemo12 {


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String yn = "";
    double total_price = 0;

    do {

        System.out.println("Enter category: tablets/syrups/firstaid/healthcare");

        String catg = sc.next();

        switch (catg) {


            case "tablets" -> {

                String tyn = "";
                double tablets_total_price = 0;

                do {

                    System.out.println("Enter the Tablet Item:");

                    String tablet_item = sc.next();

                    switch (tablet_item) {

                        case "paracetamol" -> {
                            System.out.println("Paracetamol : Price is : 20/-rs");
                            double paracetamol_price = 20;
                            tablets_total_price += paracetamol_price;
                        }

                         case "ors" -> {
                           System.out.println("ORS : Price is : 15/-rs");
                             double ors_price = 15;
                                tablets_total_price += ors_price;
                        }
                         
                        case "cetirizine" -> {
                            System.out.println("Cetirizine : Price is : 15/-rs");
                            double cetirizine_price = 15;
                            tablets_total_price += cetirizine_price;
                        }

                        case "vitaminc" -> {
                            System.out.println("Vitamin C : Price is : 30/-rs");
                            double vitaminc_price = 30;
                            tablets_total_price += vitaminc_price;
                        }

                         case "Dolo" -> {
                             System.out.println("Dolo : Price is : 5/-rs");
                             double Dolo_price = 5;
                              tablets_total_price += Dolo_price;
                        }
                         
                        case "antacid" -> {
                            System.out.println("Antacid Tablets : Price is : 25/-rs");
                            double antacid_price = 25;
                            tablets_total_price += antacid_price;
                        }

                        default ->
                            System.out.println("Entered tablet is not available");
                    }

                    System.out.println("Do you want to continue with Tablets? Click Y for yes N for no");

                    tyn = sc.next();

                } while (tyn.equalsIgnoreCase("y"));

                System.out.println("Tablets Total Price is: " + tablets_total_price);

                total_price += tablets_total_price;
            }


            case "syrups" -> {

                String syn = "";
                double syrups_total_price = 0;

                do {

                    System.out.println("Enter the Syrup Item:");

                    String syrup_item = sc.next();

                    switch (syrup_item) {

                        case "coughsyrup" -> {
                            System.out.println("Cough Syrup : Price is : 100/-rs");
                            double coughsyrup_price = 100;
                            syrups_total_price += coughsyrup_price;
                        }

                        case "antacidsyrup" -> {
                            System.out.println("Antacid Syrup : Price is : 80/-rs");
                            double antacidsyrup_price = 80;
                            syrups_total_price += antacidsyrup_price;
                        }

                        case "vitaminsyrup" -> {
                            System.out.println("Vitamin Syrup : Price is : 120/-rs");
                            double vitaminsyrup_price = 120;
                            syrups_total_price += vitaminsyrup_price;
                        }

                        case "ors" -> {
                            System.out.println("ORS : Price is : 25/-rs");
                            double ors_price = 25;
                            syrups_total_price += ors_price;
                        }

                        default ->
                            System.out.println("Entered syrup is not available");
                    }

                    System.out.println("Do you want to continue with Syrups? Click Y for yes N for no");

                    syn = sc.next();

                } while (syn.equalsIgnoreCase("y"));

                System.out.println("Syrups Total Price is: " + syrups_total_price);

                total_price += syrups_total_price;
            }

            

            case "firstaid" -> {

                String fyn = "";
                double firstaid_total_price = 0;

                do {

                    System.out.println("Enter the First Aid Item:");

                    String firstaid_item = sc.next();

                    switch (firstaid_item) {

                        case "bandage" -> {
                            System.out.println("Bandage : Price is : 30/-rs");
                            double bandage_price = 30;
                            firstaid_total_price += bandage_price;
                        }

                        case "cotton" -> {
                            System.out.println("Cotton : Price is : 40/-rs");
                            double cotton_price = 40;
                            firstaid_total_price += cotton_price;
                        }

                        case "gauze" -> {
                            System.out.println("Gauze : Price is : 50/-rs");
                            double gauze_price = 50;
                            firstaid_total_price += gauze_price;
                        }

                        case "antiseptic" -> {
                            System.out.println("Antiseptic Liquid : Price is : 90/-rs");
                            double antiseptic_price = 90;
                            firstaid_total_price += antiseptic_price;
                        }

                        default ->
                            System.out.println("Entered first aid item is not available");
                    }

                    System.out.println("Do you want to continue with First Aid items? Click Y for yes N for no");

                    fyn = sc.next();

                } while (fyn.equalsIgnoreCase("y"));

                System.out.println("First Aid Total Price is: " + firstaid_total_price);

                total_price += firstaid_total_price;
            }

            

            case "healthcare" -> {

                String hyn = "";
                double healthcare_total_price = 0;

                do {

                    System.out.println("Enter the Healthcare Item:");

                    String healthcare_item = sc.next();

                    switch (healthcare_item) {

                        case "mask" -> {
                            System.out.println("Face Mask : Price is : 10/-rs");
                            double mask_price = 10;
                            healthcare_total_price += mask_price;
                        }

                        case "sanitizer" -> {
                            System.out.println("Hand Sanitizer : Price is : 60/-rs");
                            double sanitizer_price = 60;
                            healthcare_total_price += sanitizer_price;
                        }

                        case "thermometer" -> {
                            System.out.println("Thermometer : Price is : 150/-rs");
                            double thermometer_price = 150;
                            healthcare_total_price += thermometer_price;
                        }

                        case "gloves" -> {
                            System.out.println("Medical Gloves : Price is : 40/-rs");
                            double gloves_price = 40;
                            healthcare_total_price += gloves_price;
                        }

                        default ->
                            System.out.println("Entered healthcare item is not available");
                    }

                    System.out.println("Do you want to continue with Healthcare items? Click Y for yes N for no");

                    hyn = sc.next();

                } while (hyn.equalsIgnoreCase("y"));

                System.out.println("Healthcare Total Price is: " + healthcare_total_price);

                total_price += healthcare_total_price;
            }

            default ->
                System.out.println("Entered category is not available");

        }

        System.out.println("Do you want to continue? Click Y for yes N for no");

        yn = sc.next();

    } while (yn.equalsIgnoreCase("y"));


    System.out.println("Medical Store Final Bill: " + total_price);

    sc.close();
}


}
