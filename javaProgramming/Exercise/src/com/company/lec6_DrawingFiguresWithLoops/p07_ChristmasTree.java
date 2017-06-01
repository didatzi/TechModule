package com.company.lec6_DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 11.2.2017 г..
 */
public class p07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//        int height = n + 1;
        for (int i = 0; i <= n; i++) {
            String spaces = repeat(" ", n - i);
            String stars = repeat("*", i);
            String pipe = " | ";
            System.out.println(spaces + stars + pipe + stars + spaces);
        }

    }

    private static String repeat(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }

}


