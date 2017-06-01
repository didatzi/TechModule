package com.company.exams.excNov2016.nightExam;

import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex04_logistic {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double load = 0;
        double avarage=0;
        int bus = 0;
        int truck = 0;
        int train = 0;

        for (int i = 0; i <n ; i++) {
        int tons = Integer.parseInt(scanner.nextLine());
        if (tons<=3){
            bus = bus+tons;
        }else if (tons<=11){
            truck = truck+tons;
        }else {
            train = train+tons;
        }
            load += tons;
        }
        avarage = (bus*200 + truck*175 + train*120)/load;
        System.out.printf("%.2f%n",avarage);
        System.out.printf("%.2f%%%n",bus*100.0/load);
        System.out.printf("%.2f%%%n",truck*100.0/load);
        System.out.printf("%.2f%%%n",train*100.0/load);

    }
}
