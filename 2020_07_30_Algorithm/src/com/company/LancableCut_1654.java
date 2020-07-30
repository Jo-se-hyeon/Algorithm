package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LancableCut_1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[K];

        for (int i = 0; i < K; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        long left = 1;
        long right = arr[arr.length-1];

        while (left <= right){
            long mid = (left+right) / 2;
            int sum = 0;

            for (int i = 0; i < arr.length; i++){
                sum += arr[i] / mid;
            }

            if (sum >= N){
                left = mid+1;
            }
            else
                right = mid-1;
        }
        System.out.println(right);

    }
}
