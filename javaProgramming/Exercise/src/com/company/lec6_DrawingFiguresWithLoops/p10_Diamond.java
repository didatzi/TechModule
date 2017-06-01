package com.company.lec6_DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 11.2.2017 г..
 */
public class p10_Diamond {
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
        int dashes = (n - 1) / 2;
        int midDashes = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                System.out.println(repeat("-", dashes - i) + "*" +
                       repeat("-",midDashes) +
                        "*"+ repeat("-", dashes - i));
                midDashes += 2;
            }
            midDashes= midDashes-2;
            for (int i = (n/2)-2 ; i >=0 ; i--) {
                System.out.println(repeat("-", dashes - i) + "*" +
                        repeat("-",midDashes-2) +
                        "*"+ repeat("-", dashes - i));
                midDashes -= 2;
            }

        } else {

            for (int i = 0; i < n / 2; i++) {
                if (i == 0) {
                    System.out.println(repeat("-", dashes - i) + "*"
                            + repeat("-", dashes - i));
                } else {
                    System.out.println(repeat("-", dashes - i) + "*"
                            + repeat("-", midDashes-1) + "*"
                            + repeat("-", dashes - i));
                }
                midDashes += 2;
            }
            for (int i = n / 2; i >=0 ; i--) {
                if (i == 0) {
                    System.out.println(repeat("-", dashes - i) + "*"
                            + repeat("-", dashes - i));
                } else {
                    System.out.println(repeat("-", dashes - i) + "*"
                            + repeat("-", midDashes-1) + "*"
                            + repeat("-", dashes - i));
                }
                midDashes -= 2;
            }
        }
    }
}
