package com.company.exams.excExamJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 25.2.2017 г..
 */
public class ex12_GenerateRectangles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int left = 0;
        int right = 0;
        int top = 0;
        int bottom = 0;
        int area = Math.abs(left+top) * Math.abs(right+bottom);



        System.out.printf("(%d, %d) (%d, %d) -> %d",left,top,right,bottom,area);
    }
}
