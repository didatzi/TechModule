package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 4.2.2017 г..
 */
public class ex08_IncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int tempCount = 0;
        int maxCount = 0;
        int prev = 0;
        int next = Integer.MIN_VALUE;


        for (int n = 0; n < number; n++) {

            prev = next;
            next = Integer.parseInt(scanner.nextLine());

            if (next > prev) {
                tempCount++;
            } else if (tempCount > maxCount) {
                maxCount = tempCount;
                tempCount = 1;
            } else {
                tempCount = 1;
            }
        }
        if (tempCount > maxCount) {
            maxCount = tempCount;
        }

        System.out.println(maxCount);
    }
}
