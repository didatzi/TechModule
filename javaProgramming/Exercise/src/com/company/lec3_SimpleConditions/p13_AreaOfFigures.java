package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 15.1.2017 г..
 */
public class p13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figures = scanner.nextLine();

        if (figures.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            double surface = side * side;
            System.out.printf("%.3f", surface);
        }else if (figures.equals("rectangle")){
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            double surface = side1 * side2;
            System.out.printf("%.3f", surface);
        }else if(figures.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double surface = Math.PI * radius * radius;
            System.out.printf("%.3f", surface);
        }else if (figures.equals("triangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double surface = (side * height) / 2;
            System.out.printf("%.3f", surface);
        }

    }
}
