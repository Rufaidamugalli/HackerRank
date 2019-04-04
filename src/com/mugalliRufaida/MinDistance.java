package com.mugalliRufaida;

public class MinDistance {
        static int minimumDistances(int[] a) {
            int i=0;
            int j=i+1;
            int[] diff =new int[i];
            for(i=0;i<a.length; i++){
                if(a[i]== a[j]&& diff[i]< diff[j]){
                    diff[i] =Math.abs(j-i);
                    System.out.print(diff);
                }else{
                    diff[i] =-1;
                }
            }

            return diff[i];
        }

}
