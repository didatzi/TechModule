package com.company.exams.exc28Aug2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 2.3.2017 г..
 */
public class ex01_DailyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workDays = Integer.parseInt(scanner.nextLine());
        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double change = Double.parseDouble(scanner.nextLine());

        double monthMoney = workDays * moneyPerDay;
        double yearMoney = monthMoney*12 + monthMoney*2.5;
        double tax = yearMoney*0.25;
        double yearIncome = (yearMoney - tax)*change;
        double averageSum = yearIncome/365;
        System.out.printf("%.2f",averageSum);
    }
}
