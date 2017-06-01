package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.12.2016 г..
 */
public class p06_CircleArea_andPerimeter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double r = Double.parseDouble(scanner.nextLine());
        Double area = Math.PI * r * r;
        Double perimeter = 2 * Math.PI * r;
        System.out.printf("%.3f %n", area);
        System.out.println(Math.round(perimeter));
    }
}
