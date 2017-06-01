package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 21.1.2017 г..
 */
public class p08_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sellVolume = Double.parseDouble(scanner.nextLine());

        if (sellVolume >= 0) {
            switch (town) {
                case "Sofia":
                    if (sellVolume <= 500) {
                        System.out.printf("%.2f", sellVolume * 0.05);
                    } else if (sellVolume <= 1000) {
                        System.out.printf("%.2f", sellVolume * 0.07);
                    } else if (sellVolume <= 10000) {
                        System.out.printf("%.2f", sellVolume * 0.08);
                    } else {
                        System.out.printf("%.2f", sellVolume * 0.12);
                    }
                    break;
                case "Varna":
                    if (sellVolume <= 500) {
                        System.out.printf("%.2f", sellVolume * 0.045);
                    } else if (sellVolume <= 1000) {
                        System.out.printf("%.2f", sellVolume * 0.075);
                    } else if (sellVolume <= 10000) {
                        System.out.printf("%.2f", sellVolume * 0.10);
                    } else {
                        System.out.printf("%.2f", sellVolume * 0.13);
                    }
                    break;
                case "Plovdiv":
                    if (sellVolume <= 500) {
                        System.out.printf("%.2f", sellVolume * 0.055);
                    } else if (sellVolume <= 1000) {
                        System.out.printf("%.2f", sellVolume * 0.08);
                    } else if (sellVolume <= 10000) {
                        System.out.printf("%.2f", sellVolume * 0.12);
                    } else {
                        System.out.printf("%.2f", sellVolume * 0.145);
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}

