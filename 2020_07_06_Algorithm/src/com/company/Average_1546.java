package com.company;
//백준 1546 평균 최고점을 기준으로 점수/최고점*100하여 성적 고치기
import java.util.Arrays;
import java.util.Scanner;

public class Average_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float maxScore = 0;
        float totalScore = 0;
        int size = sc.nextInt();

        float[] num = new float[size];

        for(int i = 0;i < num.length;i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);
        maxScore = num[num.length-1];

        for (int i = 0;i < num.length;i++){
            num[i] = num[i]/maxScore*100;
            totalScore += num[i];
        }
        System.out.print(totalScore/num.length);
    }
}
