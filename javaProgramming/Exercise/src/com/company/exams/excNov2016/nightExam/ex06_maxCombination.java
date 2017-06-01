package com.company.exams.excNov2016.nightExam;

import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex06_maxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int maxCombination = Integer.parseInt(scanner.nextLine());
        int combination = 0;

        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <=endNum ; j++) {
                combination++;
                if (combination>maxCombination){
                    return;
                }
                System.out.printf("<%d-%d>",i ,j);
            }

        }

    }
}

