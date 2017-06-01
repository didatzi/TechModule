package com.company.exams.exc28Aug2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 2.3.2017 г..
 */
public class ex05_Axe { private static String repeat(String strToRepeat, int count) {
    String text = "";
    for (int i = 0; i < count; i++) {
        text = text + strToRepeat;
    }
    return text;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            System.out.println(repeat("-",3* n)+ "*" + repeat("-", i)+"*" + repeat("-", 2*n-2-i));
        }
        for (int i = 0; i < n/2; i++) {
            System.out.println(repeat("*",3*n)+ "*"+ repeat("-",n-1)+ "*" + repeat("-", n-1));
        }
        for (int i = 0; i < n/2; i++) {
            if (i == n/2-1){
                System.out.println(repeat("-",3*n-i)+"*"+repeat("*",(n-1)+(i*2))+"*"+ repeat("-",n-1-i));
            }else {
                System.out.println(repeat("-", 3 * n - i) + "*" + repeat("-", (n - 1) + (i * 2)) + "*" + repeat("-", n - 1 - i));
            }
        }
    }
}
