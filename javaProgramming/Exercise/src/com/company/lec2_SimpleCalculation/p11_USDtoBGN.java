package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Didatsy on 20.12.2016 г..
 */
public class p11_USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double BGN = Double.parseDouble(scanner.nextLine());
        Double USD = 1.79549 * BGN;
        System.out.printf("%.2f BGN", USD);
    }
}
