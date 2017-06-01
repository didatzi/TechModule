package com.company.exams.excExamJan2016;
import java.util.Scanner;

/**
 * Created by Deyan.Yordanov on 01.02.2017.
 */
public class ex07_SumsStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(scan.nextLine());
            boolean range = number >= -1000 && number <= 1000;
            if (range) {
                if (i % 3 == 0) {
                    sum1 += number;

                } else if (i % 3 == 1) {
                    sum2 += number;

                } else if (i % 3 == 2) {
                    sum3 += number;

                }

            } else {
                System.out.println("error");
            }
        }
        System.out.printf("sum1 = %d%n", sum1);
        System.out.printf("sum2 = %d%n", sum2);
        System.out.printf("sum3 = %d%n", sum3);

    }
}
