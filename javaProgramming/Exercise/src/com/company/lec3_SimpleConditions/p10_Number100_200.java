package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 15.1.2017 г..
 */
public class p10_Number100_200 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 100){
            System.out.printf("Less than 100");
        }else if (number <= 200){
            System.out.println("Between 100 and 200");
        }else if (number > 200){
            System.out.println("Greater than 200");
        }
    }
}
