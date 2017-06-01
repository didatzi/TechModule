package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 15.1.2017 г..
 */
public class p12_SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        if (speed <= 10){
            System.out.println("slow");
        }else if (speed <= 50){
            System.out.println("average");
        }else if (speed <= 150){
            System.out.println("fast");
        }else if (speed <= 1000){
            System.out.println("ultra fast");
        }else if (speed > 1000){
            System.out.println("extremely fast");
        }
    }
}
