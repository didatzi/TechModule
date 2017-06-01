package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 29.1.2017 г..
 */
public class ex02_Bricks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bricks = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int cars = Integer.parseInt(scanner.nextLine());
        int allBricks = cars * workers;
        if (bricks % allBricks == 0) {
            System.out.println(Math.abs(bricks / allBricks));
        } else {
            System.out.println(Math.abs(bricks / allBricks) + 1);
        }
    }
}
