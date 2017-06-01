package com.company.exams.excNov2016;
import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex01_fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkumria = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double palamudKG = Double.parseDouble(scanner.nextLine());
        double safridKG = Double.parseDouble(scanner.nextLine());
        double midiKG = Double.parseDouble(scanner.nextLine());

        double palamudPrice = priceSkumria + priceSkumria*0.60;
        double safridPrice = priceCaca + priceCaca*0.80;

        palamudKG = palamudKG*palamudPrice;
        safridKG = safridKG*safridPrice;
        midiKG = midiKG*7.50;

        System.out.printf("%.2f", palamudKG+safridKG+midiKG);



    }
}