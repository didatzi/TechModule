package com.company.exams.exc28Aug2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 2.3.2017 г..
 */
public class ex03_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int numNights = Integer.parseInt(scanner.nextLine());
        double studio = 0.0;
        double apartment = 0.0;


        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                if (numNights > 7 && numNights<=14) {
                    studio = studio - (studio * 0.05);
                } else if (numNights > 14) {
                    studio = studio - (studio * 0.30);
                    apartment = apartment - (apartment * 0.10);
                }
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                if (numNights > 14) {
                    studio = studio - (studio * 0.20);
                    apartment = apartment - (apartment * 0.10);
                }
                break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                if (numNights > 14) {
                    apartment = apartment - (apartment * 0.10);
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartment*numNights);
        System.out.printf("Studio: %.2f lv.%n", studio*numNights);
    }
}
