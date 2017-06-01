package com.company.exams.Exam;


import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class pr01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double door = 1.2*2;
        double window = 1.5*1.5;
        double leftRightSide = 2*x*y -2*window;
        double frontBackSide = 2*x*x -door;
        double allSide = leftRightSide+frontBackSide;
        double green = allSide / 3.4;
        double roofSide = 2*x*y;
        double roofFrontBack = 2*(x*h/2);
        double allroof = roofFrontBack + roofSide;
        double red = allroof/4.3;
        System.out.printf("%.2f%n",green);
        System.out.printf("%.2f%n",red);
    }
}
