package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.X;

/**
 * Created by Deyan Yordanov on 21.1.2017 г..
 */
public class p06_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean conditionForX = ((x == x1) || (x == x2)) && ((y > y1) && (y <= y2));
        boolean conditionForY = ((y == y1) || (y == y2)) && ((x >= x1) && (x < x2));

        if (!conditionForX && !conditionForY) {
        // if (!(conditionForX || conditionForY)) {
        // if (conditionForX && conditionForY) {
            System.out.println("Inside / Outside");
        } else {
            System.out.println("Border");
        }
    }
}
