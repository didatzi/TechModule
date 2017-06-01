package com.company.lec6_DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 11.2.2017 г..
 */
public class p09_House {
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
        int stars = 0;
        int dashes=0;
        if (n % 2 == 0) {
            stars = 2;
            for (int i =0; i < (n+1)/2; i++) {
                dashes = (n-stars)/2;
                System.out.println(repeat("-", dashes) + repeat("*", stars)
                        + repeat("-", dashes));
                stars += 2;
            }
        }else{
            stars = 1;
            for (int i =0; i < (n+1)/2; i++) {
                dashes = (n-stars)/2;
                System.out.println(repeat("-", dashes) + repeat("*", stars)
                        + repeat("-", dashes));
                stars += 2;
            }
        }
        for (int i = 0; i < n/2; i++) {
            System.out.println("|" + repeat("*",n-2)+ "|");
        }

    }
}

