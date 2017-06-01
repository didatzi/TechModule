package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr06_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Еnter a number in the range [1...100]:");
        int num = Integer.parseInt(scanner.nextLine());
        while (num <1 || num>100){
            System.out.println("Invalid number!");
            System.out.print("Еnter a number in the range [1...100]:");
            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The number is: "+ num);
    }
}
