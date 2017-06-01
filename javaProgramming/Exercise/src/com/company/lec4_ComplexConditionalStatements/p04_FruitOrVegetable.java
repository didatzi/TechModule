package com.company.lec4_ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Didatsy on 23.1.2017 г..
 */
public class p04_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine().toLowerCase();
        if (product.equals("banana") || product.equals("apple")
                || product.equals("kiwi") || product.equals("cherry")
                || product.equals("lemon") || product.equals("grapes")){
            System.out.println("fruit");
        }else if (product.equals("tomato") || product.equals("cucumber")
                || product.equals("pepper") || product.equals("carrot")){
            System.out.println("vegetable");
        }else {
            System.out.println("unknown");
        }
    }
}
