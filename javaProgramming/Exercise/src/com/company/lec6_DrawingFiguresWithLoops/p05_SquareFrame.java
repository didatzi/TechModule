package com.company.lec6_DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 11.2.2017 г..
 */
public class p05_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("|");
            System.out.print(repeat(" -", n - 2));
            System.out.println(" |");
        }
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");

    }

    public static String repeat(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }

}

