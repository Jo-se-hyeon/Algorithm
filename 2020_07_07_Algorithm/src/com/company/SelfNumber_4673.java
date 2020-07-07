package com.company;
//백준 4673 셀프 넘버 *****
public class SelfNumber_4673 {
    public static void main(String[] args) {
        int[] arr = new int[10001];

        for (int n = 1; n < arr.length; n++){
            if(D(n) > 10000){
                continue;
            }
            arr[D(n)] = 1;
        }

        for(int n = 1; n < arr.length; n++){
            if(arr[n] == 0){
                System.out.println(n);
            }
        }

    }
    public static int D(int n){
        n = n + (n/1000) + ((n%1000)/100) + ((n%100)/10) + (n%10);
        return n;
    }
}
