package com.company.exams.excNov2016.nightExam;

import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex05_rocket {
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

        for (int i = 1; i <=n ; i++) {
            System.out.print(repeat(".", n/2)+repeat(".",n-i)+"/");
            System.out.print(repeat(" ",i*2-2));
            System.out.println("\\"+repeat(".",n-i)+repeat(".", n/2));
        }

        System.out.println(repeat(".", n/2)
                +repeat("*",2*n)+repeat(".", n/2));

        for (int i = 1; i <=2*n ; i++) {
            System.out.println(repeat(".", n/2)+
            "|"+repeat("\\", n*2-2)+"|"+ repeat(".", n/2));
        }

        for (int i = 0; i <n/2; i++) {
            System.out.print(repeat(".", n/2-i)+"/");
            System.out.print(repeat("*", 2*(i+n-1)));
            System.out.println("\\"+ repeat(".", n/2-i));
        }
    }
}
