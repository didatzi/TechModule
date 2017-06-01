package com.company.exams.exc28Aug2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 2.3.2017 г..
 */
public class ex02_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double workingHours = (days - (days*0.1)) * 8;
        double overtime = workers * (2 * days);
        double allHours = Math.floor(workingHours+overtime);
        if (allHours>=neededHours){
            System.out.printf("Yes!%.0f hours left.", allHours- neededHours);
        }else{
            System.out.printf("Not enough time!%.0f hours needed.",neededHours- allHours);
        }
    }
}
