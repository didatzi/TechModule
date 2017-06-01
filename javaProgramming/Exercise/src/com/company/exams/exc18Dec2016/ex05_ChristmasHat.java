package com.company.exams.exc18Dec2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.2.2017 г..
 */
public class ex05_ChristmasHat {
    private static String repeat(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String dotsTop = repeat(".",2*n-1);
        //Top
        System.out.println(dotsTop+"/|\\"+dotsTop);
        System.out.println(dotsTop+"\\|/"+dotsTop);

        //Middle;
        for (int i = 0; i <2*n ; i++) {
            String dots = repeat(".",(2*n-1)-i);
            String dashes = repeat("-", i);
            System.out.println(dots+ "*" + dashes + "*" + dashes + "*" +dots);
        }


        //Bottom
        System.out.println(repeat("*",4*n+1));
        for (int i = 1; i <=4*n+1 ; i++) {
         if(i%2!=0){
             System.out.print("*");
         }else{
             System.out.print(".");
         }
        }
        System.out.println("");
        System.out.println(repeat("*",4*n+1));
    }
}
