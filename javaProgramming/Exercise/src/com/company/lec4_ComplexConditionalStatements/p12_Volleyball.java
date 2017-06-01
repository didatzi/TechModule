package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Didatsy on 24.1.2017 г..
 */
public class p12_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int numHolidays = Integer.parseInt(scanner.nextLine());
        double playSofia = (48 - numHolidays) * 3.0 / 4;
        double holidaySofia = holidays * 2.0 / 3;
        double result = playSofia + holidaySofia + numHolidays;
        if (year.equals("leap")) {
            System.out.println((int) (result + 0.15 * result));
        } else {
            System.out.println((int) (result));
        }
    }
}
