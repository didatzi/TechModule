package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Didatsy on 17.12.2016 г..
 */
public class p07_2D_Rectangle_Area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());

        Double X = Math.abs(x1 - x2);
        Double Y = Math.abs(y1 - y2);

        Double area = X * Y;
        Double perimeter = 2*(X + Y);
        System.out.println(area);
        System.out.println(perimeter);

    }
}
