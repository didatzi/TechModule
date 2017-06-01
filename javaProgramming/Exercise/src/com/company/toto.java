package com.company;

/**
 * Created by Didatsy on 21.2.2017 г..
 */
public class toto {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 49; i++) {
            for (int j = i+1; j <=49 ; j++) {
                for (int k = j+1; k <=49 ; k++) {
                    for (int l = k+1; l <=49 ; l++) {
                        for (int m = l+1; m <= 49; m++) {
                            for (int n = m+1; n <=49 ; n++) {
                                count++;

                                //  System.out.printf("%d %d %d %d %d %d\n",i,j,k,l,m,n);

                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);

    }
}