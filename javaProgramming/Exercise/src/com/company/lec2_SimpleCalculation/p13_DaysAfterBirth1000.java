package com.company.lec2_SimpleCalculation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 15.1.2017 г..
 */
public class p13_DaysAfterBirth1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int addDays = 999;
        LocalDate data = LocalDate.parse(input, dataFormat).plusDays(addDays);

        System.out.printf(dataFormat.format(data));
    }
}
