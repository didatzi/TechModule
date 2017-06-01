package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Deyan.Yordanov on 01.02.2017.
 */
public class ex06_Sums3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        boolean numbers = (num1 > 0 && num1 <= 1000) && (num2 > 0 && num2 <= 1000) && (num3 > 0 && num3 <= 1000);
        if (numbers) {
            if (num1 + num2 == num3) {
                if (num1<=num2) {
                    System.out.printf("%d + %d = %d", num1, num2, num3);
                }else {
                    System.out.printf("%d + %d = %d", num2, num1, num3);
                }
            } else if (num1 + num3 == num2) {
                if (num1<=num3) {
                    System.out.printf("%d + %d = %d", num1, num3, num2);
                }else {
                    System.out.printf("%d + %d = %d", num3, num1, num2);
                }
            } else if (num2 + num3 == num1) {
                if (num2<=num3) {
                    System.out.printf("%d + %d = %d", num2, num3, num1);
                }else {
                    System.out.printf("%d + %d = %d", num3, num2, num1);
                }
            } else {
                System.out.println("No");
            }
        }else {
            System.out.println("error");
        }
    }
}
