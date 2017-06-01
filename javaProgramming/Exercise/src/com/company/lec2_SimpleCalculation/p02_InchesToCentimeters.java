package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

public class p02_InchesToCentimeters {
    public static void main(String[] args){
        Scanner console= new Scanner(System.in);
        System.out.print("inches: ");
        Double inches = Double.parseDouble(console.nextLine());
        Double centimeters = inches * 2.54;
        System.out.println("centimeters = " + centimeters);
    }
}
