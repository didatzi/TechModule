package com.company.exams.Exam;


import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class pr02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int planningCups = Integer.parseInt(scanner.nextLine());
        int worckers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int hours = worckers *days*8;
        double cups = Math.floor(hours/5);
        if (cups<planningCups){
            cups = planningCups-cups;
            System.out.printf("Losses: %.2f", cups*4.2);
        }else{
            cups = cups -planningCups;
            System.out.printf("%.2f extra money", cups*4.2);
        }

    }
}
