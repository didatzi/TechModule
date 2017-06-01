package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while (true) {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n % 2 != 0) {
                    System.out.println("Invalid number!");
                }else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }

        }
        System.out.println("Even number entered: "+n);
    }
}
