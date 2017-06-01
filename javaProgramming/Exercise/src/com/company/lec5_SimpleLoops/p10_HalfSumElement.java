package com.company.lec5_SimpleLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 4.2.2017 г..
 */
public class p10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int tempNum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
          int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number>tempNum){
                tempNum = number;
            }
        }
        if (tempNum == sum - tempNum) {
            System.out.printf("yes sum = %d%n", tempNum);
        } else {
            int diff = Math.abs(tempNum - (sum - tempNum));
            System.out.printf("no diff = %d%n", diff);
        }
    }
}
