package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 29.1.2017 г..
 */
public class ex03_PointOnSegment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int point = Integer.parseInt(scanner.nextLine());

        int a = Math.abs(point - firstNum);
        int b = Math.abs(point - secondNum);

        if (point <= firstNum && point >= secondNum) {
            System.out.println("in");
            if (a < b) {
                System.out.println(Math.abs(point - firstNum));
            } else {
                System.out.println(Math.abs(point - secondNum));
            }
        } else {
            System.out.println("out");
            if (a < b) {
                System.out.println(Math.abs(point - firstNum));
            } else {
                System.out.println(Math.abs(point - secondNum));
            }
        }
    }
}
