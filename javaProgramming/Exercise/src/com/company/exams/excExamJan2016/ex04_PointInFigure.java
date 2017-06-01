package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 29.1.2017 г..
 */
public class ex04_PointInFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Integer.parseInt(scanner.nextLine());
        boolean figure1 = ((x >= 4 && y <= 3) && (x <= 10 && y >= -5));
        boolean figure2 = ((x >= 2 && y <= -3) && (x <= 12 && y >= -1));
        if (figure1 || figure2) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
    }
}
