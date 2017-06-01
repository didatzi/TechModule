package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Didatsy on 23.1.2017 г..
 */
public class p11_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeShow = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        int result = row * column;
        if (typeShow.equals("Premiere")) {
            System.out.printf("%.2f leva", result * 12.00);
        } else if (typeShow.equals("Normal")) {
            System.out.printf("%.2f leva", result * 7.50);
        } else {
            System.out.printf("%.2f leva", result * 5.00);
        }
    }
}
