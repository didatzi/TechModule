package com.company.exams.exc24Apr2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class ex05_Stop {
    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        System.out.println(repeatStr(".", num + 1) + repeatStr("_", 2 * num + 1) + repeatStr(".", num + 1));
        for (int i = 0; i <= num; i++) {
            if (i == num) {
                System.out.println(repeatStr(".", num - i) + "//"
                        + repeatStr("_", 2 * num - 3) + "STOP!" + repeatStr("_", 2 * num - 3)
                        + "\\\\" + repeatStr(".", num - i));
            } else {
                System.out.println(repeatStr(".", num - i) + "//" + repeatStr("_", 2 * num - 1 + 2 * i) + "\\\\" + repeatStr(".", num - i));
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(repeatStr(".", i) + "\\\\" + repeatStr("_", 4 * num - 1 - 2 * i) + "//" + repeatStr(".", i));
        }
    }
}
