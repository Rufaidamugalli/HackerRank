package com.mugalliRufaida;

public class RepeatedString {
    // today is the forth day of starting coding 22.march.2019
    // this is an outstanding answer !!!!
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        long factor = (n / s.length());
        long rest = (n % s.length());
        count = factor * count;
        for (int i = 0; i < rest; i++)
            if (s.charAt(i) == 'a')
                count++;
        return count;
    }

        /*long numberOfLetters = 0;
        String s2 =s.substring(s.length()-1);
        for (long i=0; i<n-s2.length(); i++){
            s2 += s.replace("\0", s);

        }
            for (char c : s2.toCharArray()) {
                if (c =='a') {
                    numberOfLetters++;
                }
            }
        return ( numberOfLetters);
    }*/

    public static void main(String[] args) {
        System.out.println(repeatedString("abcac", 13));
    }
}


