package com.company.exams.excNov2016.nightExam;

import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex01_housePrice { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double smallRoom = Double.parseDouble(scanner.nextLine());
    double kitchen = Double.parseDouble(scanner.nextLine());
    double price = Double.parseDouble(scanner.nextLine());


    double bath = smallRoom*0.50;
    double firstRoom = smallRoom + smallRoom*0.10;
    double secondRoom = firstRoom + firstRoom*0.10;
    double area = smallRoom + kitchen + bath + firstRoom + secondRoom;
    area = area + area*0.05;
    double flatPrice = area *price;

    System.out.printf("%.2f", flatPrice);
}
}