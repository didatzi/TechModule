package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.12.2016 г..
 */
public class p09_CelsiusFahrenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double celsium = Double.parseDouble(scanner.nextLine());
        Double fahrenheit = celsium * 1.8 + 32;
        System.out.printf("%.2f %n", fahrenheit);
    }
}
