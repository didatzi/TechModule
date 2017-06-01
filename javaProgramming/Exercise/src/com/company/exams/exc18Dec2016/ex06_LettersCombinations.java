package com.company.exams.exc18Dec2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.2.2017 г..
 */
public class ex06_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char beginning = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char exception = scanner.nextLine().charAt(0);

        int counter = 0;
        for (char a = beginning; a <= end; a++) {
            if (a == exception) continue;
            for (char b = beginning; b <= end; b++) {
                if (b == exception) continue;
                for (char c = beginning; c <= end; c++) {
                    if (c == exception) continue;
                    System.out.printf("%c%c%c ", a, b, c);
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
