package com.company.lec5_SimpleLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 4.2.2017 г..
 */
public class p04_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum+number;
        }
        System.out.println(sum);
    }
}
