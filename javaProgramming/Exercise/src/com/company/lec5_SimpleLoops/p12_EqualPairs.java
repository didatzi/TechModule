package com.company.lec5_SimpleLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 4.2.2017 г..
 */
public class p12_EqualPairs {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int pair1Value = Integer.parseInt(input.nextLine()) + Integer.parseInt(input.nextLine());
        int maxDiff = 0;
        if (n == 1) {
            System.out.println("Yes, value = " + pair1Value);
        } else {
            for (int i = 1; i < n; i++) {
               int pair2Value = Integer.parseInt(input.nextLine()) + Integer.parseInt(input.nextLine());
                if (pair1Value != pair2Value) {
                    if (maxDiff < Math.abs(pair1Value - pair2Value)) {
                        maxDiff = Math.abs(pair1Value - pair2Value);
                    }
                    pair1Value = pair2Value;
                }
            }
            if (maxDiff == 0) {
                System.out.println("Yes, value= " + pair1Value);
            } else {
                System.out.println("No, maxDiff= " + maxDiff);
            }

        }
    }
}
