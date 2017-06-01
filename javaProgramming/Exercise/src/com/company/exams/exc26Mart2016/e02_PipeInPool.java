package com.company.exams.exc26Mart2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Deyan Yordanov on 21.1.2017 г..
 */
public class e02_PipeInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double vPool = (pipe1 + pipe2) * hours;
        double vPipe1 = 0;
        double vPipe2 = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        if (volume >= vPool) {
            vPipe1 = pipe1 * hours *100 / vPool;
            vPipe2 = pipe2 * hours *100 / vPool;
            vPool =  vPool*100 / volume;
            System.out.printf("The pool is %d%%  full. Pipe 1: %d%% Pipe 2: %d%%", (int)vPool, (int)vPipe1, (int)vPipe2);
        }else if (volume < vPool){
            vPool = vPool - volume;
            System.out.printf("For %s hours the pool overflows with %s liters", df.format(hours), df.format(vPool));
        }

    }
}
