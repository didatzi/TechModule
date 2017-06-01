package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 14.1.2017 г..
 */
public class p04_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int num = Integer.parseInt(scanner.nextLine());
        int num1 = Integer.parseInt(scanner.nextLine());
        if (num >= num1){
            System.out.println(num);
        } else {
            System.out.println(num1);
        }
    }
}
