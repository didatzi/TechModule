package com.company.lec5_SimpleLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 4.2.2017 г..
 */
public class p06_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = Integer.parseInt(scanner.nextLine());
        int min =Integer.MAX_VALUE;
        for (int i = 0; i <nums ; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers<min){
                min = numbers;
            }
        }
        System.out.println(min);
    }
}
