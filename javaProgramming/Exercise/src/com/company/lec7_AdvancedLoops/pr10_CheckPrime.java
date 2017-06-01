package com.company.lec7_AdvancedLoops;

import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class pr10_CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive Number: ");
        int num = Integer.parseInt(scanner.nextLine());
        int divider = 2;
        int maxDivider = (int) Math.sqrt(num);
        boolean prime = true;
        if (num<2){
            System.out.println("Not Prime");
        }else {
            while (prime && (divider <= maxDivider)) {
                if (num % divider == 0) {
                    prime = false;
                }
                divider++;
            }
            if (prime){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
    }
}
