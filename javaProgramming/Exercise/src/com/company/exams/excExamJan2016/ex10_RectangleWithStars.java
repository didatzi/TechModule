package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 4.2.2017 г..
 */
public class ex10_RectangleWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n ;i++) {
            System.out.print("%%");
        } System.out.println("");
        if (n%2==0) {
            for (int i = 1; i <= n-1; i++) {
                if (i==n/2){
                    System.out.print("%");
                    for (int j = 0; j < n - 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("**");
                    for (int j = 0; j < n - 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("%");
                }else {
                    System.out.print("%");
                    for (int j = 0; j < 2 * n - 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("%");
                }
            }
        }else {
            for (int i = 1; i <= n; i++) {
               if(i==(n/2)+1){
                   System.out.print("%");
                   for (int j = 0; j < n - 2; j++) {
                       System.out.print(" ");
                   }
                   System.out.print("**");
                   for (int j = 0; j < n - 2; j++) {
                       System.out.print(" ");
                   }
                   System.out.println("%");
               }else {
                   System.out.print("%");
                   for (int j = 0; j < 2 * n - 2; j++) {
                       System.out.print(" ");
                   }
                   System.out.println("%");
               }
            }
        }
        for(int i=0; i<n ;i++) {
            System.out.print("%%");
        }



    }
}
