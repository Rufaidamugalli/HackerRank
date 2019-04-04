package com.mugalliRufaida;

public class DiagonalDifference {
    static int diagonalDifference(int[][] arr) {
        int leftDiag = 0;
        int rightDiag = 0;
        int length = arr.length;

        for (int i = 0, index = length - 1; i < length; i++) {
            rightDiag += arr[i][i];
            leftDiag += arr[i][index];
            index--;
        }

        return Math.abs(leftDiag - rightDiag);
    }

    public static void main(String[] args) {

    }
}
