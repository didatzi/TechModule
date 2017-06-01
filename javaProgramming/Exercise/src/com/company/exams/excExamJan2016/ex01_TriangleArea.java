package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 29.1.2017 г..
 */
public class ex01_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = y2;
        int a = Math.abs(x2-x3);
        double h = Math.abs(y1 - y3);
        System.out.println(a*h/2);

    }
}
