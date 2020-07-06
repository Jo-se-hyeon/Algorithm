package com.company;
//백준 10818 최소, 최대 구하기
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = 0, Min = 0, Size = 0;

        Size = sc.nextInt();

        int[] num = new int[Size];

        for(int i = 0;i < num.length;i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);
        Min = num[(num.length/Size) - 1];
        Max = num[num.length - 1];

        System.out.print(Min + " " + Max);
    }
}
