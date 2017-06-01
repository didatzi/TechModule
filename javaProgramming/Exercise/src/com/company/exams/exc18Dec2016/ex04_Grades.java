package com.company.exams.exc18Dec2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.2.2017 г..
 */
public class ex04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double average =0;
        double top = 0;
        double veryGood = 0;
        double good = 0;
        double fail = 0;

        for (int i = 0; i <num ; i++) {
            double students = Double.parseDouble(scanner.nextLine());
            average +=students;
        if (students<3.00){
            fail++;
        }else if (students<4.00){
            good++;
        }else if (students<5.00){
           veryGood++;
        }else{
           top++;
        }
        }
        System.out.printf("Top students: %.2f%%%n",top/num*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",veryGood/num*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",good/num*100);
        System.out.printf("Fail: %.2f%%%n",fail/num*100);
        System.out.printf("Average: %.2f%n",average/num);
    }

}
