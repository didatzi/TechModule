package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr03_PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        System.out.println(num);
        for (int i = 1; i <=n; i++) {
            num = num*2;
            System.out.println(num);
        }
    }
}
