package com.company;
//백준 2562 최대값 배열을 이용하여 최대값과 인덱스 위치 알아내기
import java.util.Scanner;

public class Maxnum_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = 0, loc = 0, Size = 9;

        int[] num = new int[Size];
        Max = num[0];
        for(int i = 0;i < num.length;i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length;i++){
            if(num[i] > Max){
                Max = num[i];
                loc = i+1;
            }
        }

        System.out.println(Max);
        System.out.println(loc);
    }
}
