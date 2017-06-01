package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr13_NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int i = 1;
        int num = 1;
        while (true){
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ", num);
                if (num == number){
                    return;
                }
                num++;
            }
            i++;
            System.out.println();
        }
    }
}
