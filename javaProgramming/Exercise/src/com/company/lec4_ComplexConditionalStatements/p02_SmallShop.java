package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 21.1.2017 г..
 */
public class p02_SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        switch (town) {
            case "Sofia":
                if (product.equals("coffee")) {
                    System.out.println(quantity * 0.5);
                } else if (product.equals("water")) {
                    System.out.println(quantity * 0.8);
                } else if (product.equals("beer")) {
                    System.out.println(quantity * 1.2);
                } else if (product.equals("sweets")) {
                    System.out.println(quantity * 1.45);
                }else {
                    System.out.println(quantity * 1.6);
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    System.out.println(quantity * 0.45);
                } else if (product.equals("water")) {
                    System.out.println(quantity * 0.7);
                } else if (product.equals("beer")) {
                    System.out.println(quantity * 1.1);
                } else if (product.equals("sweets")) {
                    System.out.println(quantity * 1.35);
                }else {
                    System.out.println(quantity * 1.55);
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    System.out.println(quantity * 0.4);
                } else if (product.equals("water")) {
                    System.out.println(quantity * 0.7);
                } else if (product.equals("beer")) {
                    System.out.println(quantity * 1.15);
                } else if (product.equals("sweets")) {
                    System.out.println(quantity * 1.30);
                }else {
                    System.out.println(quantity * 1.5);
                }
                break;
        }
    }
}
