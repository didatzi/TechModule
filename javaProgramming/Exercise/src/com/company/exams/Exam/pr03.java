package com.company.exams.Exam;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class pr03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double money = 0;
       String place="";
       String town="";
        if (budget<=1000){
            place = "Camp";
            switch (season){
                case "Summer":
                    town = "Alaska";
                    money = budget *0.65;
                    break;
                case  "Winter":
                    town = "Morocco";
                    money = budget*0.45;
                    break;
            }
        }else if(budget<=3000){
            place = "Hut";
            switch (season){
                case "Summer":
                    town = "Alaska";
                    money = budget *0.80;
                    break;
                case  "Winter":
                    town = "Morocco";
                    money = budget*0.60;
                    break;
            }

        }else{
            place = "Hotel";
            money = budget*0.9;
            switch (season){
                case "Summer":
                    town = "Alaska";
                    break;
                case  "Winter":
                    town = "Morocco";
                    break;
            }

        }
        System.out.printf("%s - %s - %.2f", town, place, money);
    }
}
