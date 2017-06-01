package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr05_Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
//        for (int i = 1; i <= n; i= i*2+1) {
//            System.out.println(i);
//        }
        while (num<=n){
            System.out.println(num);
            num = num*2+1;
        }
    }
}
