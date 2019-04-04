package com.mugalliRufaida;

import java.util.ArrayList;
import java.util.List;

public class compareTriplets {
    public static void main(String[] args) {

    }
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> sumREsult = new ArrayList<>();
        int aliceSum =0;
        int bobSum =0;
        for (int i=0; i<a.size();i++){
            if (a.get(i)<b.get(i)){
                bobSum++;

            }else if(a.get(i)>b.get(i)){
                aliceSum++;
            }
        }
        sumREsult.add(aliceSum);
        sumREsult.add(bobSum);
        return sumREsult;

    }
}
