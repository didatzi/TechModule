package com.company.exams.excNov2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex04_SoftUniCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int car = 0;
        int van = 0;
        int smallBus = 0;
        int bigBus = 0;
        int train = 0;

        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            allPeople += people;
            if (people <= 5) {
                car += people;
            } else if (people <= 12) {
                van += people;
            } else if (people <= 25) {
                smallBus += people;
            } else if (people <= 40) {
                bigBus += people;
            } else {
                train += people;
            }
        }
        System.out.printf("%.2f%%%n", car * 100.0 / allPeople);
        System.out.printf("%.2f%%%n", van * 100.0 / allPeople);
        System.out.printf("%.2f%%%n", smallBus * 100.0 / allPeople);
        System.out.printf("%.2f%%%n", bigBus * 100.0 / allPeople);
        System.out.printf("%.2f%%%n", train * 100.0 / allPeople);
    }
}

