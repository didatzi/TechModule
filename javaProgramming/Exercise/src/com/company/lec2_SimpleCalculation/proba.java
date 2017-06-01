package com.company.lec2_SimpleCalculation;

import java.util.Scanner;

public class proba {

    public static final double USD = 1.79549D;
    public static final double EUR = 1.95583D;
    public static final double GBP = 2.53405D;
    public static final double BGN = 1D;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double amount = Double.parseDouble(console.nextLine());
        String input = console.nextLine().toUpperCase();
        String output = console.nextLine().toUpperCase();

        if (input.equals("USD")){
            switch (output){
                case "EUR":
                    amount *= USD;
                    amount /= EUR;
                    System.out.println(String.format("%.2f EUR", amount));
                    break;
                case "GBP":
                    amount *= USD;
                    amount /= GBP;
                    System.out.println(String.format("%.2f GBP", amount));
                    break;
                case "BGN":
                    amount *= USD;
                    amount /= BGN;
                    System.out.println(String.format("%.2f BGN", amount));
                    break;
            }
        } else if (input.equals("EUR")){
            switch (output) {
                case "USD":
                    amount *= EUR;
                    amount /= USD;
                    System.out.println(String.format("%.2f USD", amount));
                    break;
                case "GBP":
                    amount *= EUR;
                    amount /= GBP;
                    System.out.println(String.format("%.2f GBP", amount));
                    break;
                case "BGN":
                    amount *= EUR;
                    amount /= BGN;
                    System.out.println(String.format("%.2f BGN", amount));
                    break;
            }
        } else if (input.equals("GBP")){
            switch (output){
                case "EUR":
                    amount *= GBP;
                    amount /= EUR;
                    System.out.println(String.format("%.2f EUR", amount));
                    break;
                case "USD":
                    amount *= GBP;
                    amount /= USD;
                    System.out.println(String.format("%.2f USD", amount));
                    break;
                case "BGN":
                    amount *= GBP;
                    amount /= BGN;
                    System.out.println(String.format("%.2f BGN", amount));
                    break;
            }
        }else {
            switch (output){
                case "USD":
                    amount /= USD;
                    System.out.println(String.format("%.2f USD", amount));
                    break;
                case "EUR":
                    amount /= EUR;
                    System.out.println(String.format("%.2f EUR", amount));
                    break;
                case "GBP":
                    amount /= GBP;
                    System.out.println(String.format("%.2f GBP", amount));
                    break;
            }
        }


    }
}