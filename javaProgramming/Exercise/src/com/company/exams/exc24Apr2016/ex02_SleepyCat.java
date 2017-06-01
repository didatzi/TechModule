package com.company.exams.exc24Apr2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class ex02_SleepyCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekends = Integer.parseInt(scanner.nextLine());
        int workDaysinMin = 63;
        int restDaysinMin = 127;
        int norm = 30000;
        int days = (365 - weekends) * workDaysinMin;
        int weekendsinMin = restDaysinMin * weekends;
        int sumMin = days + weekendsinMin;
        if (sumMin < norm) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", (norm - sumMin) / 60, (norm - sumMin) % 60);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", (sumMin - norm) / 60, (sumMin - norm) % 60);
        }
    }
}
