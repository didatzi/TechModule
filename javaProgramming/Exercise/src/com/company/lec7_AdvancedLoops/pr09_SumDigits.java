package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr09_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int number = 1;
        int sum = 0;
       while (number >0) {
           number = num%10;
           sum = sum+number;
           number = (num - number) / 10;
           num = number;
       }
        System.out.println(sum);

    }
}
