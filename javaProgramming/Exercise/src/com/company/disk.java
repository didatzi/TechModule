package com.company;

/**
 * Created by Didatsy on 21.2.2017 г..
 */
import java.util.Scanner;

public class disk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int radius = Integer.parseInt(scan.nextLine());
        int center = length / 2;


        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                boolean isInCircle = (Math.sqrt(Math.pow(row - center, 2) + Math.pow(col - center, 2))) <= radius;
                if(isInCircle){
                    System.out.printf("*");
                }else{
                    System.out.printf(".");
                }
            }
            System.out.println();
        }
    }
}
