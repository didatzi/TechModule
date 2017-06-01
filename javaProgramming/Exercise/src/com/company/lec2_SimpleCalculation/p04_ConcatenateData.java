package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.12.2016 г..
 */
public class p04_ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s." ,
                firstName, lastName, age, town);
    }

}
