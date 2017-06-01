package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 14.1.2017 г..
 */
public class p06_BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if(number <= 100){
           bonus += 5;
        }else if ( number <= 1000){
            bonus = number * 0.2;
        }else if (number > 1000){
            bonus += number * 0.1;
        }
        if (number % 2 == 0){
            bonus += 1;
        }else if (number % 5 == 0){
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + number);
    }
}


