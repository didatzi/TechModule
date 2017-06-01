package com.company.exams.exc06Mart2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.1.2017 г..
 */
public class e03_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMins = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMins = Integer.parseInt(scanner.nextLine());


        int examHoursToMin = (examHours * 60) + examMins;
        int arrivalHoursToMin = (arrivalHours * 60) + arrivalMins;
        int minDifference = arrivalHoursToMin - examHoursToMin;

        if (minDifference > 0) {
            int hours = minDifference / 60;
            int minutes = minDifference % 60;
            if (hours > 0) {
                System.out.printf("Late %d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("Late %d minutes after the start", minutes);
            }
        }
        else if (minDifference < -30) {
            int hours = Math.abs(minDifference) / 60;
            int minutes = Math.abs(minDifference) % 60;
            if (hours > 0) {
                System.out.printf("Early %d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("Early %d minutes before the start", minutes);
            }
        }
        else {
            int minutes = Math.abs(minDifference);
            if (minDifference == 0) {
                System.out.println("On time");
            }else {
                System.out.printf("On time %d minutes before the start", minutes);
            }
        }
    }
}
