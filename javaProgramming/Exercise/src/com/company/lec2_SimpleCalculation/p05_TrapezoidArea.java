package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.12.2016 г..
 */
public class p05_TrapezoidArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double b1 = Double.parseDouble(scanner.nextLine());
        Double b2 = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());
        Double area = (b1 + b2) * h / 2;
        System.out.println("Trapezoid area = " + area);
    }
}
