package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Didatsy on 15.1.2017 г..
 */
public class p08_MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String firstUnit = scanner.nextLine();
        String secondUnit = scanner.next();
        double distanceInM = 0;
        double finalOutcome = 0;

        double mm = 1000; /* millimeters (mm)*/
        double cm = 100; /* centimeters (cm)*/
        double mi = 0.000621371192; /* miles (mi)*/
        double in = 39.3700787; /* inches (in)*/
        double km = 0.001; /* kilometers (km)*/
        double ft = 3.2808399; /* feet (ft)*/
        double yd = 1.0936133; /* yards (yd)*/


        if (firstUnit.equals("km")) {
            distanceInM = number / km;
        } else if (firstUnit.equals("mm")) {
            distanceInM = number / mm;
        } else if (firstUnit.equals("cm")) {
            distanceInM = number / cm;
        } else if (firstUnit.equals("mi")) {
            distanceInM = number / mi;
        } else if (firstUnit.equals("in")) {
            distanceInM = number / in;
        } else if (firstUnit.equals("ft")) {
            distanceInM = number / ft;
        } else if (firstUnit.equals("yd")) {
            distanceInM = number / yd;
        } else if (firstUnit.equals("m")) {
            distanceInM = number;
        }

        if (secondUnit.equals("mm")) {
            finalOutcome = distanceInM * mm;
        } else if (secondUnit.equals("cm")) {
            finalOutcome = distanceInM * cm;
        } else if (secondUnit.equals("mi")) {
            finalOutcome = distanceInM * mi;
        } else if (secondUnit.equals("in")) {
            finalOutcome = distanceInM * in;
        } else if (secondUnit.equals("km")) {
            finalOutcome = distanceInM * km;
        } else if (secondUnit.equals("ft")) {
            finalOutcome = distanceInM * ft;
        } else if (secondUnit.equals("yd")) {
            finalOutcome = distanceInM * yd;
        } else if (secondUnit.equals("m")) {
            finalOutcome = distanceInM;
        }
        System.out.printf("%f %s", finalOutcome, secondUnit);
    }
}
