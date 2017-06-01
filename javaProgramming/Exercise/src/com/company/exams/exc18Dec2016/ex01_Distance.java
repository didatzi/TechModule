package com.company.exams.exc18Dec2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.2.2017 г..
 */
public class ex01_Distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = Integer.parseInt(scanner.nextLine());
        double firstTime = Double.parseDouble(scanner.nextLine()) / 60;
        double secondTime = Double.parseDouble(scanner.nextLine()) / 60;
        double thirdTime = Double.parseDouble(scanner.nextLine()) / 60;

        double incSpeed = speed + speed * 0.1;
        double decSpeed = incSpeed - incSpeed * 0.05;
        double distance1 = speed * firstTime;
        double distance2 = incSpeed * secondTime;
        double distance3 = decSpeed * thirdTime;
        double sumDistance = distance1 + distance2 + distance3;

        System.out.printf("%.2f", sumDistance);
    }
}


