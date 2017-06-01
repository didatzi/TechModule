package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.1.2017 г..
 */
public class p15_3EqualNumbers {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        if ((num1 == num2)&&(num2 == num3)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}

