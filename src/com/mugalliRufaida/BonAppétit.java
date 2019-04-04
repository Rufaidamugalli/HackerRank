package com.mugalliRufaida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BonAppétit {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        bill.remove(k);
        int sum = 0;
        int result = 0;
        int diff = 0;
        for (int bill2 : bill) {
            sum += bill2;
        }
        result = sum / 2;
        diff = b - result;

        if (diff != 0) {
            System.out.println(diff);
        } else {
            System.out.println("Bon Appetit");
        }

    }

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        bonAppetit(bill, 1, 7);
    }
}
