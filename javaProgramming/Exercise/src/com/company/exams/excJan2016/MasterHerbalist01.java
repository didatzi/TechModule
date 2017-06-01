package com.company.exams.excJan2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 12.3.2017 г..
 */
public class MasterHerbalist01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dailyExpenses = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        double money = 0;
        double totalMoney = 0;
        int days = 0;


        while (!str.equals("Season Over")) {
            String[] parts = str.split(" ", 3);
            int hours = Integer.valueOf(parts[0]);
            String path = parts[1];
            double price = Double.parseDouble(parts[2]);
            int countH = 0;
            for (int i = 0; i < hours; i++) {
                if (path.charAt(i % path.length()) == 'H') {
                    countH ++;
                }
            }
            money = price * countH;
            totalMoney += money;
            days++;
            str=sc.nextLine();
        }
        double average = totalMoney / days;
        double extra = average - dailyExpenses;

        if (average >= dailyExpenses) {
            System.out.printf("Times are good. Extra money per day: %.2f.", extra);
        } else {
            double needed = days*((totalMoney/days)-dailyExpenses);
            System.out.printf("We are in the red. Money needed: %d.", Math.abs((int)(needed)));
        }
    }
}
