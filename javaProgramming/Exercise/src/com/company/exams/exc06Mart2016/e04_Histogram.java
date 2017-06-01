package com.company.exams.exc06Mart2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.1.2017 г..
 */
public class e04_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberLines = Integer.parseInt(scanner.nextLine());
        double num1 = 0.00;
        double num2 = 0.00;
        double num3 = 0.00;
        double num4 = 0.00;
        double num5 = 0.00;

        for (int i = 0; i < numberLines; i++) {
            int newNumber = Integer.parseInt(scanner.nextLine());
            if (newNumber < 200) {
                num1++;
            }
           else if (newNumber < 400) {
                num2++;
            }
            else if (newNumber < 600) {
                num3++;
            }
            else if (newNumber < 800) {
                num4++;
            }
            else if (newNumber >= 800) {
                num5++;
            }
        }
        System.out.printf("%.2f%% %n", num1 / numberLines * 100);
        System.out.printf("%.2f%% %n", num2 / numberLines * 100);
        System.out.printf("%.2f%% %n", num3 / numberLines * 100);
        System.out.printf("%.2f%% %n", num4 / numberLines * 100);
        System.out.printf("%.2f%% %n", num5 / numberLines * 100);
    }
}
