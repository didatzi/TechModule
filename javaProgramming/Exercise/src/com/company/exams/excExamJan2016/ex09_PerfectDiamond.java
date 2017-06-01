package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 15.2.2017 г..
 */
public class ex09_PerfectDiamond {
    private static String repeat(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.print(repeat(" ", n - i));

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = n-1; i >= 1; i--) {
            System.out.print(repeat(" ", n - i));

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
