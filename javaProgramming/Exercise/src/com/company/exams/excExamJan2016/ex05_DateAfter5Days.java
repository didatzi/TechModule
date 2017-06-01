package com.company.exams.excExamJan2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Didatsy on 29.1.2017 г..
 */
public class ex05_DateAfter5Days {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat myFormatter = new DecimalFormat("00");
        int day = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        boolean monthsDays = month <= 12 && month > 0 && day <= 31 && day > 0;
        day += 5;
        int daysOfMonth = 31;
        if (monthsDays) {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    daysOfMonth = 30;
                    break;
                case 2:
                    daysOfMonth = 28;
                    break;
            }
            if (day > daysOfMonth) {
                day = day - daysOfMonth;
                month++;
                if (month == 13) {
                    month = 1;
                }
            }
            System.out.println(day + "." + myFormatter.format(month));
        }else {
            System.out.println("error");
        }
    }
}

