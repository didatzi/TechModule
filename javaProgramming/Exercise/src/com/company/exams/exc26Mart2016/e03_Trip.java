package com.company.exams.exc26Mart2016;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 21.1.2017 г..
 */
public class e03_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.next();
        String dest = "";
        String vacation = "";

        if (season.equals("summer")) {
            vacation = "Camp";
            if (budget >= 10 && budget <= 100) {
                dest = "Bulgaria";
                budget = budget * 0.30;
            } else if (budget <= 1000) {
                dest = "Balkans";
                budget = budget * 0.40;
            } else if (budget <= 5000) {
                dest = "Europe";
                vacation = "Hotel";
                budget = budget * 0.90;
            }

        } else if (season.equals("winter")) {
            vacation = "Hotel";
            if (budget >= 10 && budget <= 100) {
                dest = "Bulgaria";
                budget = budget * 0.70;
            } else if (budget <= 1000) {
                dest = "Balkans";
                budget = budget * 0.80;
            } else if (budget <= 5000) {
                dest = "Europe";
                budget = budget * 0.90;
            }

        }
        System.out.printf("Somewhere in %s%n", dest);
        System.out.printf("%s - %.2f%n", vacation, budget);
    }
}
