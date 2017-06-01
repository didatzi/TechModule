package com.company.exams.excNov2016;

import java.util.Scanner;

/**
 * Created by Didatsy on 25.2.2017 г..
 */
public class ex06_PokemonBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPokemon = Integer.parseInt(scanner.nextLine());
        int secondPokemon = Integer.parseInt(scanner.nextLine());
        int maxBattles = Integer.parseInt(scanner.nextLine());
        int battles = 0;

        for (int i = 1; i <= firstPokemon; i++) {
            for (int j = 1; j <= secondPokemon; j++) {
                battles++;
                if (battles>maxBattles){
                    return;
                }
                System.out.printf("(%d <-> %d) ", i, j);

            }
        }


    }
}
