package com.company.exams.Softuniada2017;

import java.util.Scanner;

/**
 * Created by Didatsy on 12.3.2017 г..
 */
public class ex02_HalloweenPumpkin {
    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr(".",n-1)+ "_/_"+repeatStr(".",n-1));
        System.out.println("/"+repeatStr(".",n-2)+ "^,^"+repeatStr(".",n-2)+"\\");
        for (int i = 0; i <n-3 ; i++) {
            System.out.println("|"+repeatStr(".",2*n-1)+"|");
        }
        System.out.println("\\"+repeatStr(".",n-2)+ "\\_/"+repeatStr(".",n-2)+"/");

    }
}
