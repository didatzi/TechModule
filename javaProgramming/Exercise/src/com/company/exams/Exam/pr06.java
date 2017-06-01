package com.company.exams.Exam;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class pr06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int firstNum = 0;
        int secondNum = 0;
        for (int i = start; i >= end; i--) {
            for (int j = start; j >= end; j--) {
                count++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", count, magicNumber);
    }
}
