package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr07_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int bigger = Math.max(a,b);
        while (a % bigger != 0 || b % bigger != 0) {
            bigger--;
        }
        System.out.println(bigger);
    }
}
