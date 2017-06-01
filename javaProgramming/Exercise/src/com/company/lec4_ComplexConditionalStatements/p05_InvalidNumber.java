package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 21.1.2017 г..
 */
public class p05_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isInRange = number == 0 || number >= 100 && number <= 200;
        if (!isInRange) {
            System.out.println("invalid");
        }
    }
}
