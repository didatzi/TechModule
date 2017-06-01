package com.company.exams.exc06Mart2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.1.2017 г..
 */
public class e05_DrawFort {
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
        String base = "\\" + repeat("_", n / 2) + "/";
        String top = "/" + repeat("^", n / 2) + "\\";
        int gap = 2*n - 2*(n/2+2);
        if (n < 5) {

            System.out.println(top + top);
        } else {
            System.out.println(top + repeat("_", gap) + top);

        }
        for (int i = 0; i < n - 2; i++) {
            if (n < 5) {
                    System.out.println("|" + repeat(" ", 2 * n - 2) + "|");
            } else if (n % 2 == 0) {
                if (i == n-3){
                    System.out.println("|" + repeat(" ",n / 2 + 1)
                            + repeat("_", gap) +
                            repeat(" ",n / 2 + 1)+ "|");
                }else {
                    System.out.println("|" + repeat(" ", 2 * n - 2) + "|");
                }
            } else if(n % 2 != 0 ){
                if (i == n-3){
                    System.out.println("|" + repeat(" ",n / 2 + 1)
                            + repeat("_", gap) +
                            repeat(" ",n / 2 + 1)+ "|");
                }else {
                    System.out.println("|" + repeat(" ", 2 * n - 2) + "|");
                }
            }
                   }
        if (n < 5) {

            System.out.println(base + base);
        } else {
            System.out.println(base + repeat(" ", gap) + base);

        }
    }
}

