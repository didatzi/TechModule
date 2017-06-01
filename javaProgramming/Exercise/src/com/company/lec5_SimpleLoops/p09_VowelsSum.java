package com.company.lec5_SimpleLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 4.2.2017 г..
 */
public class p09_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
