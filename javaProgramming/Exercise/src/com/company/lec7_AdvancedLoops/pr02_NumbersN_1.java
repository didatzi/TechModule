package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr02_NumbersN_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = n; i >=1; i--) {
            System.out.println(i);
        }
    }
}
