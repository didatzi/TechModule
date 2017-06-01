package com.company.exams.exc06Mart2016;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 15.1.2017 г..
 */
public class e01_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double h = Double.parseDouble(scanner.nextLine());
        Double w = Double.parseDouble(scanner.nextLine());
        int row = (int)(h / 1.20);
        int line = (int)((w-1) /0.70);
        System.out.println((row * line)-3);
    }
}
