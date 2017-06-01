package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Didatsy on 24.1.2017 г..
 */
public class p13_PointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        boolean inFirst = ((x > 0) && (x < 3 * h)) && ((y > 0) && (y < h));
        boolean inSecond = ((x > h) && (x < 2 * h)) && ((y >= h) && (y < 4 * h));
        boolean border = ((x >= 0) && (x <= 3 * h)) && ((y >= 0) && (y <= h))
                || ((x >= h) && (x <= 2 * h)) && ((y >= h) && (y <= 4 * h));

        if (inFirst || inSecond) {
            System.out.println("inside");
        } else if (border) {
            System.out.println("border");
        } else {
            System.out.println("outside");
        }
    }
}
