package com.company.lec3_SimpleConditions;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Deyan.Yordanov on 17.01.2017.
 */
public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minute = Integer.parseInt(scan.nextLine());
        int newTime = 15;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("H:mm");
        LocalTime time = LocalTime.of(hour, minute).plusMinutes(newTime);
        System.out.println(dateFormat.format(time));
    }
}
