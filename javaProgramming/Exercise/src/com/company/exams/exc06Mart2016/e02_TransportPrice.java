package com.company.exams.exc06Mart2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.1.2017 г..
 */
public class e02_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometres = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        double price = 0;
        String vehicle = "";

        if (kilometres >= 1 && kilometres < 20 && timeOfDay.equals("day")){
            price = 0.79 * kilometres + 0.70;
            vehicle = "Taxi";
        }else if (kilometres < 20 && timeOfDay.equals("night")){
            price =  0.90 * kilometres + 0.70;
            vehicle = "Taxi";
        }else if(kilometres <100 && timeOfDay.equals("day")){
            price = 0.09 * kilometres;
            vehicle = "Bus";
        }else  if (kilometres <100 && timeOfDay.equals("night")){
            price = 0.09 * kilometres;
            vehicle = "Bus";
        }else if (kilometres <5000 && timeOfDay.equals("day")){
           price = 0.06 * kilometres;
            vehicle = "Train";
        }else if (kilometres <5000 && timeOfDay.equals("night")){
            price = 0.06 * kilometres;
            vehicle = "Train";
        }
        System.out.printf("You're using %s for %d kilometres and " +
                "the price of your trip is %.2f", vehicle, kilometres, price);
    }
}
