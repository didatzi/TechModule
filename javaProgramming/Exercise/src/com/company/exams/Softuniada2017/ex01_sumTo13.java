package com.company.exams.Softuniada2017;

import java.util.Scanner;

/**
 * Created by Didatsy on 12.3.2017 г..
 */
public class ex01_sumTo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());



    if (a + b + c == 13 ||
            -a + b + c == 13 ||
            a - b + c == 13 ||
            a + b - c == 13 ||
            -a - b + c == 13 ||
            -a + b - c == 13 ||
            a - b - c == 13 ||
            -a - b - c == 13){
            System.out.println("Yes");
        }else {

        System.out.println("No");
    }
    }
}
