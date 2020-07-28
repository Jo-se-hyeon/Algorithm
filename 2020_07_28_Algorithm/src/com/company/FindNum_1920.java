package com.company;
//백준 1920 수 찾기
import java.util.Arrays;
import java.util.Scanner;

public class FindNum_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrN = new int[N];
        for (int i  = 0; i < N; i++){
            arrN[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arrM = new int[M];
        for (int i = 0; i < M; i++){
            arrM[i] = sc.nextInt();
        }
        Arrays.sort(arrN);
        for (int i = 0; i < M; i++){
            System.out.println(bin_tree(arrN, arrM[i], 0 , N-1));
        }

    }
    public static int bin_tree(int[] arrN, int i, int start, int end){
        if (start > end) {
            return 0;
        }
        int mid = (start + end)/2;

        if (arrN[mid] > i){
            return bin_tree(arrN, i, start, mid-1);
        }
        else if (arrN[mid] < i){
            return bin_tree(arrN, i, mid+1, end);
        }
        else
            return 1;
    }
}
