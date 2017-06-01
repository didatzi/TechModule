package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Didatsy on 14.1.2017 г..
 */
public class p03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean even = (num % 2 == 0);
        if (even) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
