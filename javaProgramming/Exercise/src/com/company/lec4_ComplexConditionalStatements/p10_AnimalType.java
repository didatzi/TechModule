package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Didatsy on 23.1.2017 г..
 */
public class p10_AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine().toLowerCase();
        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
