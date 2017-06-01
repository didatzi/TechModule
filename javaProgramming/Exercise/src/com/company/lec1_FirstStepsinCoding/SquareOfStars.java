package com.company.lec1_FirstStepsinCoding;

import java.util.Scanner;

/**
 * Created by Didatsy on 12/12/2016.
 */
public class SquareOfStars{
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for(int i=0; i<n ;i++)
            System.out.print("*");
            System.out.println(" ");
        for(int i=0; i<n-2 ;i++) {
            System.out.print("*");
            for(int j =0; j< n-2; j++)
                System.out.print(" ");
                System.out.println("*");
        }
        for(int i=1; i<=n ;i++)
            System.out.print("*");
    }
}

