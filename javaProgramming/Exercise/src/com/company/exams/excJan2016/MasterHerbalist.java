package com.company.exams.excJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 12.3.2017 г..
 */
public class MasterHerbalist {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double n = Double.parseDouble(scan.nextLine());
        double totalCashCounter = 0;
        int days = 0;

        while (true) {
            int hourHerbCounter = 0;
            double cashForHerbs = 0;

            String[] input = scan.nextLine().split(" ");

            if (input[0].equals("Season")){
                break;
            }

            int hours = Integer.valueOf(input[0]);
            cashForHerbs = Double.valueOf(input[2]);


            for (int i = 0; i < hours; i++) {
                String path = input[1];
                if(path.charAt(i% path.length())=='H'){
                    hourHerbCounter += 1;
                }
            }
            double cashDaily = hourHerbCounter * cashForHerbs;
            totalCashCounter += cashDaily;
            days++;
        }
        if (totalCashCounter/days >= n){
            System.out.printf("Times are good. Extra money per day: %.2f.", (totalCashCounter/days - n));
        } else {
            System.out.printf("We are in the red. Money needed: %.0f.", days * Math.abs((totalCashCounter/days) - n));

        }
    }
}
