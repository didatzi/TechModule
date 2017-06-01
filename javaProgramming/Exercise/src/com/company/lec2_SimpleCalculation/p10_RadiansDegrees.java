package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Didatsy on 20.12.2016 г..
 */
public class p10_RadiansDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double rad = Double.parseDouble(scanner.nextLine());
        Double deg = 180 / Math.PI * rad;
        System.out.println(Math.round(deg));
    }
}
