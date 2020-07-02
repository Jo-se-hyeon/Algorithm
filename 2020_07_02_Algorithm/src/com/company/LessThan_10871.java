package com.company;
//백준 10871 X보다 작은 수 지정한 수보다 작은 수 출력
import java.util.Scanner;
public class LessThan_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, N;
        N = sc.nextInt();
        X = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            //System.out.print(Arrays.toString(A));
        }
        for (int i = 0; i < N; i++){
            if(A[i] < X){
                System.out.print((A[i]) + " ");
            }
        }
    }
}
