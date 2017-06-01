package com.company.lec5_SimpleLoops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Didatsy on 4.2.2017 г..
 */
public class p11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;
        double oddSum = 0;
        double evenSum = 0;

        DecimalFormat myFormat = new DecimalFormat("#.##");


        if (n == 0) {
            System.out.println("OddSum=0");
            System.out.println("OddMin=No");
            System.out.println("OddMax=No");
            System.out.println("EvenSum=0");
            System.out.println("EvenMin=No");
            System.out.println("EvenMax=No");
        } else if (n == 1) {
            for (int i = 1; i <= n; i++) {
                double number = Double.parseDouble(scanner.nextLine());
                System.out.println("OddSum=" + myFormat.format(number) + ",");
                System.out.println("OddMin=" + myFormat.format(number) + ",");
                System.out.println("OddMax=" + myFormat.format(number) + ",");
                System.out.println("EvenSum=0");
                System.out.println("EvenMin=No");
                System.out.println("EvenMax=No");
            }
        } else {

            for (int i = 1; i <= n; i++) {
                double number = Double.parseDouble(scanner.nextLine());
                if (i % 2 == 0) {
                    evenSum += number;
                    if (number > evenMax)
                        evenMax = number;
                    if (evenMin > number)
                        evenMin = number;
                } else {
                    oddSum += number;
                    if (number > oddMax)
                        oddMax = number;
                    if (oddMin > number)
                        oddMin = number;
                }
            }
        }
        System.out.println("OddSum=" + myFormat.format(oddSum) + ",");
        System.out.println("OddMin=" + myFormat.format(oddMin) + ",");
        System.out.println("OddMax=" + myFormat.format(oddMax) + ",");
        System.out.println("EvenSum=" + myFormat.format(evenSum) + ",");
        System.out.println("EvenMin=" + myFormat.format(evenMin) + ",");
        System.out.println("EvenMax=" + myFormat.format(evenMax));
    }
}
