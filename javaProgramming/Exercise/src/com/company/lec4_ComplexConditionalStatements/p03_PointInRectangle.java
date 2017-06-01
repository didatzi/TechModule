package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 21.1.2017 г..
 */
public class p03_PointInRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean xy = ((x >= x1) && (x <= x2)) && ((y >= y1) && (y <= y2));
        if (xy){
            System.out.println("Inside");
        }else{
            System.out.println("Outside");
        }
    }
}
