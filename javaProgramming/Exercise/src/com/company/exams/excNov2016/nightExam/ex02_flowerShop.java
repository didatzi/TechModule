package com.company.exams.excNov2016.nightExam;

import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex02_flowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnols = Integer.parseInt(scanner.nextLine());
        int zumbuls = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());
        double allPrice = magnols*3.25 + zumbuls*4 + rose*3.50 + cactus*8;
        double taxes = allPrice*0.05;
        double profit = allPrice-taxes;

        if (profit>=priceGift){

            System.out.printf("She is left with %.0f leva.", Math.floor(profit-priceGift));
        }else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceGift-profit));
        }
    }
}
