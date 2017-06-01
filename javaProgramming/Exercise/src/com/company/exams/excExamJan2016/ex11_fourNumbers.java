package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 25.2.2017 г..
 */
public class ex11_fourNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        boolean printedAny = false;

        for (int i = a; i <= b; i++) {
            for (int j = i+1; j <=b ; j++) {
                for (int k = j+1; k <=b ; k++) {
                    for (int l = k+1; l <=b ; l++) {
                        printedAny = true;
                        System.out.printf("%d %d %d %d\n",i,j,k,l);
                    }
                }
            }
        }

        if (!printedAny){
            System.out.println("No");
        }

    }

}
