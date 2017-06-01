package com.company.lec1_FirstStepsinCoding;

import java.util.Scanner;

/**
 * Created by Didatsy on 12/12/2016.
 */
public class SurfaceRectangle {
    public static void main (String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter number of side A");
            int a = Integer.parseInt(console.nextLine());
            System.out.println("Enter number of side B");
            int b = Integer.parseInt(console.nextLine());
            int area = a * b;
            System.out.println("Area of Rectangle is:" + area);

    }
}
