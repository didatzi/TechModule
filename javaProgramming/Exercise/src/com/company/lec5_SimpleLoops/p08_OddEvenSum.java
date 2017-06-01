package com.company.lec5_SimpleLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 4.2.2017 г..
 */
public class p08_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven = sumEven + number;
            } else {
                sumOdd = sumOdd + number;
            }
        }
        if (sumEven == sumOdd) {
            System.out.printf("Yes%nSum = %d%n", sumEven);
        } else {
            int diff = Math.abs(sumEven - sumOdd);
            System.out.printf("No%nDiff = %d%n", diff);
        }
    }
}
