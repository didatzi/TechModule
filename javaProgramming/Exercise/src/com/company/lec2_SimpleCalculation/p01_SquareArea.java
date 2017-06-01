package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 17.12.2016 г..
 */
public class p01_SquareArea {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.parseInt(console.nextLine());
        int area = a * a;
        System.out.println("Square = " + area);
    }
}
