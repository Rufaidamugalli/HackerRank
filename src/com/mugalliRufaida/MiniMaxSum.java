package com.mugalliRufaida;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
      /*  long max = arr[0];
        long min =arr[0];
        long sum=0;
        long result =0;
        long result2 =0;
        for(int i=0;  i<=arr.length-1;i++){
            sum +=arr[i];
            if(arr[i]>max){
                max =arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }


        }
        result = sum-min;
        result2 = sum-max;
        System.out.println(result2 +" "+result);
*/
        int max = 0;
        int min = 0;
        int result = 0;
        int result2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            max += arr[i];
            arr[i] = arr[i + 1];
            min += arr[i];
            result2 = (max < min) ? max : min;

        }
        System.out.println(result2 + " " + result);

    }
}
