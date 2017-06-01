package com.company.exams.excNov2016;
import java.util.Scanner;

/**
 * Created by Didatsy on 1.3.2017 г..
 */
public class ex02_pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFoodKG = Double.parseDouble(scanner.nextLine());
        double catFoodKG = Double.parseDouble(scanner.nextLine());
        double turtleFoodG = Double.parseDouble(scanner.nextLine());

        dogFoodKG = dogFoodKG*days;
        catFoodKG = catFoodKG*days;
        turtleFoodG = turtleFoodG/1000 *days;
        double foodNeed = dogFoodKG+catFoodKG+turtleFoodG;
        if(foodNeed<=food){
            System.out.printf("%.0f kilos of food left.",Math.floor(food-foodNeed));
        }else{
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeed-food));
        }

    }
}