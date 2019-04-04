package com.mugalliRufaida;

import java.util.Scanner;

public class CountingValleys {
    static int countingValleys(int n, String s) {

        char[] str = s.toCharArray();
        int valley = 0;
        int currentlevel = 0;

        for (char c : str) {
            if (c == 'U') {
                currentlevel++;
                System.out.println("currentlevel :"+ currentlevel);

            } else {
                currentlevel--;
                System.out.println("currentlevel :"+ currentlevel);

            }
            if (currentlevel==0 && c=='U'){
                valley++;
            }
        }
        return valley;
    }

    private static final Scanner scanner = new Scanner(System.in);


}
