package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr12_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int fibo1 =1;
        int fibo2 =1;
        int fibonacci = 1;
        for (int i = 1; i < n ; i++) {
           fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
           fibo2 = fibonacci;
        }
        System.out.println(fibonacci);
    }
}
