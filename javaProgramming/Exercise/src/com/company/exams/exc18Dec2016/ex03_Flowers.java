package com.company.exams.exc18Dec2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.2.2017 г..
 */
public class ex03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double flower1 = Double.parseDouble(scanner.nextLine());
        double flower2 = Double.parseDouble(scanner.nextLine());
        double flower3 = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        char yn = scanner.nextLine().toUpperCase().charAt(0);

        double sum = 0.0;
        double flower1Price=0;
        double flower2Price=0;
        double flower3Price=0;
        if (yn == 'N') {
        if (season.equals("Spring") || season.equals("Summer")) {
            flower1Price = flower1 * 2.00;
            flower2Price = flower2 * 4.10;
            flower3Price = flower3 * 2.50;
            sum = flower1Price + flower2Price + flower3Price;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            flower1Price = flower1 * 3.75;
            flower2Price = flower2 * 4.50;
            flower3Price = flower3 * 4.15;
            sum = flower1Price + flower2Price + flower3Price;
        }
            if(flower3>7 && season.equals("Spring")){
            sum= sum-sum*0.05;
            }else if(flower2>=10 && season.equals("Winter")){
                sum= sum-sum*0.1;
            }
            if (flower1+flower2+flower3>20){
                sum= sum-sum*0.2;
            }
            System.out.printf("%.2f",sum+2);
        } else if (yn == 'Y') {
            if (season.equals("Spring") || season.equals("Summer")) {
                flower1Price = flower1 * 2.00;
                flower2Price = flower2 * 4.10;
                flower3Price = flower3 * 2.50;
                sum = flower1Price + flower2Price + flower3Price;
            } else if (season.equals("Autumn") || season.equals("Winter")) {
                flower1Price = flower1 * 3.75;
                flower2Price = flower2 * 4.50;
                flower3Price = flower3 * 4.15;
                sum = flower1Price + flower2Price + flower3Price;
            }
            sum= sum + sum * 0.15;
            if(flower3>7 && season.equals("Spring")){
                sum= sum-sum*0.05;
            }else if(flower2>=10 && season.equals("Winter")){
                sum= sum-sum*0.1;
            }
            if (flower1+flower2+flower3>20){
                sum= sum-sum*0.2;
            }
            System.out.printf("%.2f",sum+2);
        }

    }
}

