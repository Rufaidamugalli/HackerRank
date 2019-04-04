package com.mugalliRufaida;

public class BirthdayCakeCandles {


    static int birthdayCakeCandles(int[] ar) {
        int birthdayCakeCandles = 0;
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max)
                max = ar[i];
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == max)
                birthdayCakeCandles++;

        }

        return birthdayCakeCandles;
    }

    public static void main(String[] args) {

    }

}
