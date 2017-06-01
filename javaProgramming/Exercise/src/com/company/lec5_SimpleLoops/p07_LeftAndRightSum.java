package com.company.lec5_SimpleLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 4.2.2017 г..
 */
public class p07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
       int rightSum = 0;


        for (int i = 0; i < num; i++) {
            int leftNum = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum+leftNum;
        }
        for (int i = 0; i < num; i++) {
            int rightNum = Integer.parseInt(scanner.nextLine());
            rightSum += rightNum;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d%n", leftSum);
        } else {
            int sum = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d%n", sum);
        }

    }
}
