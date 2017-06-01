package com.company.exams.exc26Mart2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 28.1.2017 г..
 */
public class e04_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberLines = Integer.parseInt(scanner.nextLine());
        double dividedBy2 = 0.00;
        double dividedBy3 = 0.00;
        double dividedBy4 = 0.00;

        for (int i = 0; i < numberLines; i++) {
            int newNumber = Integer.parseInt(scanner.nextLine());
            if (newNumber % 2 == 0) {
                dividedBy2++;
            }
            if (newNumber % 3 == 0) {
                dividedBy3++;
            }
            if (newNumber % 4 == 0) {
                dividedBy4++;
            }
        }
        System.out.printf("%.2f%% %n", dividedBy2 / numberLines * 100);
        System.out.printf("%.2f%% %n", dividedBy3 / numberLines * 100);
        System.out.printf("%.2f%% %n", dividedBy4 / numberLines * 100);
    }
}
