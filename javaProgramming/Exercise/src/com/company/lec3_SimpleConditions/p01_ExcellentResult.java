package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Didatsy on 14.1.2017 г..
 */
public class p01_ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 5.50){
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}
