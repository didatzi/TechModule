package com.company.lec6_DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Didatsy on 11.2.2017 г..
 */
public class p08_Sunglasses {
    private static String repeat(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(repeat("*", 2 * num) + repeat(" ", num)
                + repeat("*", 2 * num));
        for (int i = 0; i <num -2 ; i++) {
            System.out.print("*" + repeat("/", 2*num -2) + "*");
            if ( i == (num -2)/2 && num %2 !=0) {
                System.out.print(repeat("|", num));
            }else if (i == ((num -2)/2)-1  && num %2 ==0){
                System.out.print(repeat("|", num));
            }else {
                System.out.print(repeat(" ", num));
            }
            System.out.println("*" + repeat("/", 2*num -2) + "*");
        }


        System.out.println(repeat("*", 2 * num) + repeat(" ", num)
                + repeat("*", 2 * num));
    }
}
