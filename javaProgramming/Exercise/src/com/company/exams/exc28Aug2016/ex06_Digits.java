package com.company.exams.exc28Aug2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 2.3.2017 г..
 */
public class ex06_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int firstNum = number / 100;
        int middleNum = (number / 10) % 10;
        int lastNum = number % 10;
        int rows = firstNum + middleNum;
        int columns = firstNum + lastNum;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (number % 5 == 0) {
                    number = number - firstNum;
                } else if ((number % 3 == 0)) {
                    number = number - middleNum;
                } else {
                    number = number + lastNum;
                }
                System.out.printf("%d ", number);
            }
            System.out.println();
        }

    }
}
