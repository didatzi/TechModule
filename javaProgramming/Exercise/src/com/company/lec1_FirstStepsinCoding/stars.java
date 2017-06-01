package com.company.lec1_FirstStepsinCoding;

/**
 * Created by Deyan Yordanov on 13.12.2016 г..
 */
public class stars {
    public static void drawSquare(int size) {
        for (int i = 1; i < size; i++)
            System.out.print("*");
        System.out.println("");
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
            for (int j = 0; j < size - 3; j++)
                System.out.print(" ");
            System.out.println("*");
        }

        for (int i = 1; i < size; i++)
            System.out.print("*");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        drawSquare(50);
    }
}
