package com.company.lec6_DrawingFiguresWithLoops;


/**
 * Created by Didatsy on 11.2.2017 г..
 */
public class p01_Rectangle10x10Stars {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(repeat("*", 10));
        }
    }

    public static String repeat(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }

}
