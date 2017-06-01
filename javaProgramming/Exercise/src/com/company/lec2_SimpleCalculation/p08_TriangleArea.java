package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.12.2016 г..
 */
public class p08_TriangleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double a = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());
        Double area = a * h / 2;
//        System.out.println(Math.round(area));
//        System.out.println(area);
        System.out.printf("%.2f %n", area);
    }
}
