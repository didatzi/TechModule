package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

/**
 * Created by deyan.yordanov on 11.01.2017.
 */
public class p12_CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.parseDouble(scanner.nextLine());
        double BGN = 1;
        double USD = 1.79549;
        double EUR = 1.95583;
        double GBP = 2.53405;

        String currencyIn = scanner.nextLine();
        String currencyOut = scanner.nextLine();

        if (currencyIn.equals("USD")) {
            value = value * USD;
        } else if (currencyIn.equals("EUR")) {
            value = value * EUR;
        } else if (currencyIn.equals("GBP")) {
            value = value * GBP;
        } else if (currencyIn.equals("BGN")) {
            value = value * BGN;
        }
        if (currencyOut.equals("USD")) {
            value = value / USD;
        } else if (currencyOut.equals("EUR")) {
            value = value / EUR;
        } else if (currencyOut.equals("GBP")) {
            value = value / GBP;
        } else if (currencyOut.equals("BGN")) {
            value = value / BGN;
        }
        System.out.printf("%.2f %s", value, currencyOut);
    }
}