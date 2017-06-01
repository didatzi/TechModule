package com.company.lec6_DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 11.2.2017 г..
 */
public class p06_RhombusStars {
    private static String repeat(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num ; i++) {
            System.out.print(repeat(" ", num-i));
            System.out.println(repeat(" *", i).trim());
        }
        for (int i = num-1; i >= 1 ; i--) {
            System.out.print(repeat(" ", num-i));
            System.out.println(repeat(" *", i).trim());
        }
    }
}
