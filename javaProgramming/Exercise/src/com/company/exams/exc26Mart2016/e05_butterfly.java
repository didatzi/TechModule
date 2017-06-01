package com.company.exams.exc26Mart2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 15.2.2017 г..
 */
public class e05_butterfly {
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
        for (int i = 0; i < n-2; i++) {
            if (i%2==0){
                System.out.println(repeat("*", n-2)+ "\\" + " "
                        + "/" + repeat("*",n-2));
            }else{
                System.out.println(repeat("-", n-2)+ "\\" + " "
                        + "/" + repeat("-",n-2));
            }
        }
        System.out.println(repeat(" ",n-1)+"@");
        for (int i = 0; i < n-2; i++) {
            if (i%2==0){
                System.out.println(repeat("*", n-2)+ "/" + " "
                        + "\\" + repeat("*",n-2));
            }else{
                System.out.println(repeat("-", n-2)+ "/" + " "
                        + "\\" + repeat("-",n-2));
            }
        }
    }
}
