package com.company.lec5_SimpleLoops;

/**
 * Created by Deyan Yordanov on 4.2.2017 г..
 */
public class p02_NumbersEndingIn7 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
