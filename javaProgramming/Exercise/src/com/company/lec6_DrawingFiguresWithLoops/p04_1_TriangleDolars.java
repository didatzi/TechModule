package com.company.lec6_DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 11.2.2017 г..
 */
public class p04_1_TriangleDolars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(repeat(" ", n - i) + repeat("$ ", i));
        }
    }

    public static String repeat(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }

}

