package com.company;

import java.util.Scanner;

/**
 * Created by Didatsy on 21.2.2017 г..
 */
public class dna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int length = Integer.parseInt(scan.nextLine());
        System.out.println("Please enter a character to start from:");
        char startingLetter = scan.nextLine().charAt(0);

        int index = startingLetter - 'A';
        String[] letterArr = {"A", "B", "C", "D", "E", "F", "G"};

        int currentLine = 0;

        while (true) {
            for (int i = 0; i < 4; i++) {
                if (currentLine >= length) {
                    return;
                }
                System.out.printf(repeatStr(".", 3 - i));
                for (int j = 0; j < i * 2 + 1; j++) {
                    System.out.print(letterArr[index]);
                    index = (index + 1) % 7;
                }
                System.out.println(repeatStr(".", 3 - i));
                currentLine++;
            }

            for (int i = 0; i < 3; i++) {
                if (currentLine >= length) {
                    return;
                }
                System.out.printf(repeatStr(".", 1 + i));
                for (int j = 0; j < 5 - 2 * i; j++) {
                    System.out.print(letterArr[index]);
                    index = (index + 1) % 7;
                }
                System.out.println(repeatStr(".", 1 + i));
                currentLine++;
            }
        }
    }

    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}
