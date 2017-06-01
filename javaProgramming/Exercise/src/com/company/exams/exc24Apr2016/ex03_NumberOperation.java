package com.company.exams.exc24Apr2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class ex03_NumberOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", num1, num2, result);
                } else {
                    System.out.printf("%d + %d = %.0f - odd", num1, num2, result);
                }
                break;
            case "-":
                result = num1 - num2;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even", num1, num2, result);
                } else {
                    System.out.printf("%d - %d = %.0f - odd", num1, num2, result);
                }
                break;
            case "*":
                result = num1 * num2;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", num1, num2, result);
                } else {
                    System.out.printf("%d * %d = %.0f - odd", num1, num2, result);
                }
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = (double) num1 / num2;
                    System.out.printf("%d / %d = %.2f", num1, num2, result);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = num1 % num2;
                    System.out.printf("%d %% %d = %.0f", num1, num2, result);
                }
                break;
        }

    }
}
