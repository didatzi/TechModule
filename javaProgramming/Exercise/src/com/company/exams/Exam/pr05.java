package com.company.exams.Exam;

import java.util.Scanner;

/**
 * Created by Didatsy on 18.3.2017 г..
 */
public class pr05 {
    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatStr("*", 2*n+1));
        for (int i = 1; i <n ; i++) {
            if (i==1){
                System.out.println(repeatStr(".",i)+"*"+repeatStr(" ", (2*n-1) - 2*i)+"*"+repeatStr(".",i));
            }else {
                System.out.println(repeatStr(".", i) + "*" + repeatStr("@", (2 * n - 1) - 2 * i) + "*" + repeatStr(".", i));
            }
        }
        System.out.println(repeatStr(".", n)+"*"+repeatStr(".", n)); //middle

        for (int i = 1; i <n ; i++) {
          if (i==n-1){
              System.out.print(repeatStr(".", n - i) + "*");
              System.out.print(repeatStr("@", i - 1) + "@" + repeatStr("@", i - 1));
              System.out.println("*" + repeatStr(".", n - i));
          }else {
              System.out.print(repeatStr(".", n - i) + "*");
              System.out.print(repeatStr(" ", i - 1) + "@" + repeatStr(" ", i - 1));
              System.out.println("*" + repeatStr(".", n - i));
          }
        }
        System.out.println(repeatStr("*", 2*n+1));
    }
}
