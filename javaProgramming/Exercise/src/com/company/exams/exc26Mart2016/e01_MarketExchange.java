package com.company.exams.exc26Mart2016;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 15.1.2017 г..
 */
public class e01_MarketExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVeg = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        int totalVeg = Integer.parseInt(scanner.nextLine());
        int totalFruit = Integer.parseInt(scanner.nextLine());

        double vegetables = priceVeg * totalVeg;
        double fruit = priceFruit * totalFruit;
        double amount = (vegetables + fruit)/1.94;
        System.out.printf("%.13f", amount);

    }
}
