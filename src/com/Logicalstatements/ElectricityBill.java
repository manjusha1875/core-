package com.Logicalstatements;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the connection type (Domestic or Commercial):");
        String connection = sc.next();

        System.out.println("Enter the units:");
        int units = sc.nextInt();

        int charge = 0;
        switch (connection) {

        case "Domestic" -> {
            if(units<=0) {
            	System.out.println("Invalid details");
            }
            else if (units <= 100) {
                charge = 2 * units;
            } 
            else if (units <= 300) {
                charge = 3 * units;
            } 
           
            System.out.println("Domestic Electricity Bill: " + charge);
        }

        case "Commercial" -> {

            if (units <= 100) {
                charge = 4 * units;
            } 
            else if (units <= 300) {
                charge = 6 * units;
            } 
            else {
                charge = 8 * units;
            }

            System.out.println("Commercial Electricity Bill: " + charge);
        }

        default -> {
            System.out.println("Invalid Connection Type");
        }

        }

        sc.close();
    }
}