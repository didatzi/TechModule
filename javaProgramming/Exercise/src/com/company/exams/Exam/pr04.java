package com.company.exams.Exam;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class pr04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lesions = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int timesJelev = 0;
        int timesRoYaL = 0;
        int timesRoli = 0;
        int timesTrofon = 0;
        int timesSino = 0;
        int timesOthers = 0;
        for (int i = 1; i <=lesions ; i++) {
            String lectors = scanner.nextLine();
        switch (lectors){
            case "Jelev":
                timesJelev++;
                break;
            case "RoYaL":
                timesRoYaL++;
                break;
            case "Roli":
                timesRoli++;
                break;
            case "Trofon":
                timesTrofon++;
                break;
            case "Sino":
                timesSino++;
                break;
                default:
                    timesOthers++;
                    break;
        }
        }
        System.out.printf("Jelev salary: %.2f lv%n", budget/lesions * timesJelev);
        System.out.printf("RoYaL salary: %.2f lv%n", budget/lesions * timesRoYaL);
        System.out.printf("Roli salary: %.2f lv%n", budget/lesions * timesRoli);
        System.out.printf("Trofon salary: %.2f lv%n", budget/lesions * timesTrofon);
        System.out.printf("Sino salary: %.2f lv%n", budget/lesions * timesSino);
        System.out.printf("Others salary: %.2f lv%n", budget/lesions * timesOthers);
    }
}
