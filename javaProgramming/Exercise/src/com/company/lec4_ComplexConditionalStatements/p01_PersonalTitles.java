package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 21.1.2017 г..
 */
public class p01_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine().toLowerCase();
        switch (gender) {
            case "m":
                if (number >= 16) {
                    System.out.println("Mr.");
                } else {
                    System.out.println("Master");
                }
                break;
            case "f":
                if (number >= 16) {
                    System.out.println("Ms.");
                } else {
                    System.out.println("Miss");
                }
                break;
        }

    }
}
