package com.company.exams.exc18Dec2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 16.2.2017 г..
 */
public class ex02_ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double weightFloor = Double.parseDouble(scanner.nextLine());
        double lengthFloor = Double.parseDouble(scanner.nextLine());
        double tile = Double.parseDouble(scanner.nextLine());
        double heightTile = Double.parseDouble(scanner.nextLine());
        double priceTile = Double.parseDouble(scanner.nextLine());
        double master = Double.parseDouble(scanner.nextLine());

        double x = weightFloor * lengthFloor/(tile * heightTile / 2);

        double tileNum = Math.ceil(x) + 5;
        double total = tileNum * priceTile + master;
        if (total <= money) {
            System.out.printf("%.2f lv left.", (money - total));
        } else {
            System.out.printf("You'll need %.2f lv more.", (total - money));
        }
    }

}
