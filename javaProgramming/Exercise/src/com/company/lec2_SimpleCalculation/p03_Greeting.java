package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 17.12.2016 г..
 */
public class p03_Greeting {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.printf("Hello, " + name + "!");
    }
}