package com.company.exams.exc28Aug2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 2.3.2017 г..
 */
public class ex04_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int treated = 0;
        int unTreated;
        int allUntreated = 0;
        int doctors = 7;
        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && allUntreated > treated) {
                ++doctors;
            }
            if (patients <= doctors) {
                treated += patients;
            } else {
                unTreated = patients - doctors;
                treated += doctors;
                allUntreated += unTreated;
            }
        }
        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.%n", allUntreated);
    }
}
