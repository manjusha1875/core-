
package com.Logicalstatements;

import java.util.Scanner;

// Switch Case POC: Nested Switch
// WAPOC Related Restaurant Orders: Invoice Management

public class Categoriesitems {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn = "";
        double total_price = 0;

        do {

            System.out.println("Enter veg/non-veg/starters/drinks:");
            String catg = sc.next();

            switch (catg) {

                // VEG ITEMS
                case "Veg" -> {

                    String vyn = "";
                    double veg_total_price = 0;

                    do {

                        System.out.println("Enter the Veg Item:");
                        String veg_item = sc.next();

                        switch (veg_item) {

                            case "pbm" -> {
                                System.out.println("Paneer Butter Masala - Price: 250/- Rs");
                                double pbm_price = 250;
                                veg_total_price += pbm_price;
                            }

                            case "dal" -> {
                                System.out.println("Dal Tadka - Price: 200/- Rs");
                                double dal_price = 200;
                                veg_total_price += dal_price;
                            }

                            case "pvm" -> {
                                System.out.println("Paneer Tikka Masala - Price: 280/- Rs");
                                double pvm_price = 280;
                                veg_total_price += pvm_price;
                            }

                            case "matar" -> {
                                System.out.println("Matar Paneer - Price: 240/- Rs");
                                double matar_price = 240;
                                veg_total_price += matar_price;
                            }

                            case "chole" -> {
                                System.out.println("Chole Masala - Price: 180/- Rs");
                                double chole_price = 180;
                                veg_total_price += chole_price;
                            }

                            case "kadai" -> {
                                System.out.println("Kadai Paneer - Price: 260/- Rs");
                                double kadai_price = 260;
                                veg_total_price += kadai_price;
                            }

                            case "palak" -> {
                                System.out.println("Palak Paneer - Price: 230/- Rs");
                                double palak_price = 230;
                                veg_total_price += palak_price;
                            }

                            case "mixveg" -> {
                                System.out.println("Mixed Vegetable Curry - Price: 190/- Rs");
                                double mixveg_price = 190;
                                veg_total_price += mixveg_price;
                            }

                            case "aloo" -> {
                                System.out.println("Aloo Gobi - Price: 170/- Rs");
                                double aloo_price = 170;
                                veg_total_price += aloo_price;
                            }

                            case "mushroom" -> {
                                System.out.println("Mushroom Masala - Price: 220/- Rs");
                                double mushroom_price = 220;
                                veg_total_price += mushroom_price;
                            }

                            default ->
                                System.out.println("Entered Veg Item Is Not Available");
                        }

                        System.out.println(
                            "Do you want to continue with Veg Items? Enter Y for yes or N for no:"
                        );

                        vyn = sc.next();

                    } while (vyn.equalsIgnoreCase("y"));

                    System.out.println("Veg Total Price: " + veg_total_price + "/- Rs");

                    total_price += veg_total_price;
                }

                // NON-VEG ITEMS
                case "Non-Veg" -> {

                    String nvyn = "";
                    double non_veg_total_price = 0;

                    do {

                        System.out.println("Enter the Non-Veg Item:");
                        String non_veg_item = sc.next();

                        switch (non_veg_item) {

                            case "mdb" -> {
                                System.out.println("Mutton Dum Biryani - Price: 500/- Rs");
                                double mdb_price = 500;
                                non_veg_total_price += mdb_price;
                            }

                            case "chb" -> {
                                System.out.println("Chicken Dum Biryani - Price: 350/- Rs");
                                double chb_price = 350;
                                non_veg_total_price += chb_price;
                            }

                            case "mgb" -> {
                                System.out.println("Mutton Gongura Biryani - Price: 550/- Rs");
                                double mgb_price = 550;
                                non_veg_total_price += mgb_price;
                            }

                            case "prawnb" -> {
                                System.out.println("Prawn Biryani - Price: 450/- Rs");
                                double prawnb_price = 450;
                                non_veg_total_price += prawnb_price;
                            }

                            case "eggb" -> {
                                System.out.println("Egg Biryani - Price: 250/- Rs");
                                double eggb_price = 250;
                                non_veg_total_price += eggb_price;
                            }

                            case "fishb" -> {
                                System.out.println("Fish Biryani - Price: 400/- Rs");
                                double fishb_price = 400;
                                non_veg_total_price += fishb_price;
                            }

                            case "ch65" -> {
                                System.out.println("Chicken 65 - Price: 300/- Rs");
                                double ch65_price = 300;
                                non_veg_total_price += ch65_price;
                            }

                            case "chillch" -> {
                                System.out.println("Chilli Chicken - Price: 320/- Rs");
                                double chillch_price = 320;
                                non_veg_total_price += chillch_price;
                            }

                            case "chmaj" -> {
                                System.out.println("Chicken Majestic - Price: 350/- Rs");
                                double chmaj_price = 350;
                                non_veg_total_price += chmaj_price;
                            }

                            case "tikka" -> {
                                System.out.println("Chicken Tikka - Price: 330/- Rs");
                                double tikka_price = 330;
                                non_veg_total_price += tikka_price;
                            }

                            case "fishfry" -> {
                                System.out.println("Fish Fry - Price: 280/- Rs");
                                double fishfry_price = 280;
                                non_veg_total_price += fishfry_price;
                            }

                            default ->
                                System.out.println("Entered Non-Veg Item Is Not Available");
                        }

                        System.out.println(
                            "Do you want to continue with Non-Veg Items? Enter Y for yes or N for no:"
                        );

                        nvyn = sc.next();

                    } while (nvyn.equalsIgnoreCase("y"));

                    System.out.println(
                        "Non-Veg Total Price: " + non_veg_total_price + "/- Rs"
                    );

                    total_price += non_veg_total_price;
                }

                // STARTER ITEMS
                case "starters" -> {

                    String syn = "";
                    double star_total_price = 0;

                    do {

                        System.out.println("Enter the Starter Item:");
                        String starter_item = sc.next();

                        switch (starter_item) {

                            case "gobimanch" -> {
                                System.out.println("Gobi Manchurian - Price: 180/- Rs");
                                double gobimanch_price = 180;
                                star_total_price += gobimanch_price;
                            }

                            case "paneertikka" -> {
                                System.out.println("Paneer Tikka - Price: 250/- Rs");
                                double paneertikka_price = 250;
                                star_total_price += paneertikka_price;
                            }

                            case "crispycorn" -> {
                                System.out.println("Crispy Corn - Price: 200/- Rs");
                                double crispycorn_price = 200;
                                star_total_price += crispycorn_price;
                            }

                            case "chillipaneer" -> {
                                System.out.println("Chilli Paneer - Price: 240/- Rs");
                                double chillipaneer_price = 240;
                                star_total_price += chillipaneer_price;
                            }

                            case "vegmanch" -> {
                                System.out.println("Veg Manchurian - Price: 180/- Rs");
                                double vegmanch_price = 180;
                                star_total_price += vegmanch_price;
                            }

                            case "frenchfries" -> {
                                System.out.println("French Fries - Price: 150/- Rs");
                                double frenchfries_price = 150;
                                star_total_price += frenchfries_price;
                            }

                            case "springrolls" -> {
                                System.out.println("Veg Spring Rolls - Price: 200/- Rs");
                                double springrolls_price = 200;
                                star_total_price += springrolls_price;
                            }

                            case "babycorn" -> {
                                System.out.println("Baby Corn Fry - Price: 220/- Rs");
                                double babycorn_price = 220;
                                star_total_price += babycorn_price;
                            }

                            case "mushroomtikka" -> {
                                System.out.println("Mushroom Tikka - Price: 250/- Rs");
                                double mushroomtikka_price = 250;
                                star_total_price += mushroomtikka_price;
                            }

                            case "vegcutlet" -> {
                                System.out.println("Veg Cutlet - Price: 120/- Rs");
                                double vegcutlet_price = 120;
                                star_total_price += vegcutlet_price;
                            }

                            default ->
                                System.out.println("Invalid Starter Item");
                        }

                        System.out.println(
                            "Do you want to order another Starter? Enter Y for yes or N for no:"
                        );

                        syn = sc.next();

                    } while (syn.equalsIgnoreCase("y"));

                    System.out.println(
                        "Total Starters Price: " + star_total_price + "/- Rs"
                    );

                    total_price += star_total_price;
                }

                // DRINKS CATEGORY - TO BE ADDED
                case "drinks" -> {
                    System.out.println("Drinks category is not implemented yet.");
                }

                // INVALID CATEGORY
                default ->
                    System.out.println("Entered Category Is Not Available");
            }

            System.out.println(
                "Do you want to continue ordering? Enter Y for yes or N for no:"
            );

            yn = sc.next();

        } while (yn.equalsIgnoreCase("y"));

        // FINAL INVOICE
        System.out.println("--------------------------------");
        System.out.println("       RESTAURANT INVOICE       ");
        System.out.println("--------------------------------");
        System.out.println("Total Bill Amount: " + total_price + "/- Rs");
        System.out.println("--------------------------------");

        sc.close();
    }
}

