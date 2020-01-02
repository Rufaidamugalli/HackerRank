package com.mugalliRufaida;

public class TimeConv {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        String hh = s.substring(0, 2);
        String date = s.substring(2, 8);
        int t = Integer.parseInt(hh);
        t += 12;

        String str = Integer.toString(t);
        if (str.equals("12") || str.equals("24")) {
            str = "00";
        }
        String timeCon = str.concat(date);

        System.out.println(timeCon);


        return timeCon;
    }

    public static void main(String[] args) {
        timeConversion("06:40:03AM");
    }
}
