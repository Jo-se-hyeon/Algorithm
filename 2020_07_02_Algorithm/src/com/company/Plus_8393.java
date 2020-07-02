package com.company;
//백준 8393 주어진 n에 1 ~ n까지의 합 구하기
import java.util.Scanner;
public class Plus_8393 {
    public static void main(String[] args) {
        int num = (new Scanner(System.in)).nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
