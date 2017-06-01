package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        System.out.println(num);
        for (int i = 0; i < n; i++) {
            num = num*2;
            if (i%2!=0) {
                System.out.println(num);
            }
        }
    }
}
