package com.company.lec3_SimpleConditions;

import java.util.Scanner;

/**
 * Created by Didatsy on 15.1.2017 г..
 */
public class p07_SumSeconds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sport1 = Integer.parseInt(scanner.nextLine());
        int sport2 = Integer.parseInt(scanner.nextLine());
        int sport3 = Integer.parseInt(scanner.nextLine());

        int totalSeconds = sport1 + sport2 + sport3;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        if (seconds < 10){
            System.out.println(minutes + ":0" + seconds);
        }else {
            System.out.println(minutes + ":" + seconds);
        }
    }
}
