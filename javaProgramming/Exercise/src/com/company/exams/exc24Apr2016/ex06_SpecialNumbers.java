package com.company.exams.exc24Apr2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class ex06_SpecialNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int endNum = Integer.parseInt(in.nextLine());

        for (int i = 1; i <=9 ; i++) {
            if (endNum%i!=0) {
                continue;
            }
            for (int j = 1; j <=9 ; j++) {
                if (endNum%j!=0) {
                    continue;
                }
                for (int k = 1; k <=9 ; k++) {
                    if (endNum%k!=0) {
                        continue;
                    }
                    for (int l = 1; l <=9 ; l++) {
                        if (endNum%l==0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }

    }
}
