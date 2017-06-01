package com.company.exams.exc24Apr2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class ex04_SmartLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lilyAge = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int toy=0;
        int savings = 0;
        int brother = 0;
        double sum;
        for (int i = 1; i <= lilyAge; i++) {
            if(i%2!=0){
            toy++;
            }else {
            money+=10;
            brother++;
            savings = savings+money;
            }

        }
        sum = savings + (toy*priceToy) - brother;
        if (sum >= priceLaundry){
            System.out.printf("Yes! %.2f",sum-priceLaundry);
        }else{
            System.out.printf("No! %.2f", priceLaundry-sum);
        }
    }
}
