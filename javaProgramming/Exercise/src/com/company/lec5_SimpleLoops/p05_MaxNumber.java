package com.company.lec5_SimpleLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 4.2.2017 г..
 */
public class p05_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <nums; i++) {
         int numbers = Integer.parseInt(scanner.nextLine());
        if (numbers>max){
            max = numbers;
        }
        }
        System.out.println(max);
    }
}
