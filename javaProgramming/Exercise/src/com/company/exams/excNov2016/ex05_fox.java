package com.company.exams.excNov2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 28.2.2017 г..
 */
public class ex05_fox {
    private static String repeat(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n =0;
        while (true) {
            try {
                System.out.println("Enter odd number:");
                n = Integer.parseInt(scanner.nextLine());
                if (n % 2 == 0) {
                    System.out.println("Invalid number!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        }
//        int n = Integer.parseInt(scanner.nextLine()); /*if there isn't a try
        for (int i = 1; i <= n; i++) {
            System.out.println(repeat("*", i) + "\\"
                    + repeat("-", (n - i)) + repeat("-", n - i + 1)
                    + "/" + repeat("*", i));
        }
        for (int i = 1; i <= n / 3; i++) {
            System.out.println("|" + repeat("*", n / 2 - 1 + i)
                    + "\\" + repeat("*", n - 2 * i + 2) + "/" + repeat("*", n / 2 - 1 + i) + "|");
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(repeat("-", i) + "\\"
                    + repeat("*", (n - i)) + repeat("*", n - i + 1)
                    + "/" + repeat("-", i));
        }
    }
}

