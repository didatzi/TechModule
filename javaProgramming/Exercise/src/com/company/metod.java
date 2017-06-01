package com.company;

/**
 * Created by Deyan Yordanov on 18.2.2017 г..
 */
public class metod {
    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
