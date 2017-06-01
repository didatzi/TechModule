package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr08_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        long n = a;
//        int x = 1;
//        while (x < a) {
//            n = n * x;
//            x++;
//        }
//        System.out.println(n);
        for (int i = 1; i < a; i++) {
            n = i * n;

        }
        System.out.println(n);
    }
}
