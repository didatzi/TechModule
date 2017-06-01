package com.company.exams.excNov2016;
import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex03_vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oldPeople = Integer.parseInt(scanner.nextLine());
        double  students = Integer.parseInt(scanner.nextLine());
        double  nights = Integer.parseInt(scanner.nextLine());
        String transport = scanner.nextLine();
        double hotel = 82.99;
        double commission =0.1;
        switch (transport){
            case ("train"):
                if (oldPeople>=50 || students>=50){
                    oldPeople = oldPeople*(24.99*0.5);
                    students = students*(14.99*0.5);
                }else{
                    oldPeople = oldPeople*24.99;
                    students = students*14.99;
                }
                break;
            case ("bus"):
                oldPeople = oldPeople*32.50;
                students = students*28.50;
                break;
            case("boat"):
                oldPeople = oldPeople*42.99;
                students = students*39.99;
                break;
            case("airplane"):
                oldPeople = oldPeople*70.00;
                students = students*50.00;
                break;
        }
        hotel = nights*hotel;
        double transportPrice = (oldPeople+students)*2;
        commission = commission*(transportPrice+hotel);
        System.out.printf("%.2f", (transportPrice + hotel +commission));


    }
}