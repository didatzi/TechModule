package com.company.exams.excNov2016.nightExam;

import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex03_bikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double junior = Integer.parseInt(scanner.nextLine());
        double senior = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();
        double sum = 0;
        double expenses = 0;
        switch (track) {
            case ("trail"):
                junior = junior * 5.50;
                senior = senior * 7;
                break;
            case ("cross-country"):
                if (junior + senior >= 50) {
                    junior = junior * 8 * 0.75;
                    senior = senior * 9.50 * 0.75;
                }else {
                    junior = junior * 8;
                    senior = senior * 9.50;
                }
                break;
            case ("downhill"):
                junior = junior * 12.25;
                senior = senior * 13.75;
                break;
            case ("road"):
                junior = junior * 20;
                senior = senior * 21.50;
                break;
        }
        sum = junior + senior;
        expenses = sum * 0.05;
        System.out.printf("%.2f", sum - expenses);
    }
}
