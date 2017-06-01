package com.company.exams.exc06Mart2016;

import java.util.Scanner; 

public class e06_StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int charNum = Integer.parseInt(scanner.nextLine());
        int character = charNum + 97;
        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number; j++) {
                for (int k = 97; k < character; k++) {
                    for (int l = 97; l < character; l++) {
                        for (int m = 1; m <= number; m++) {
                            if (m > i && m > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}
