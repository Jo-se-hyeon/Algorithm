package com.company;
//백준 10039 평균점수 구하기
import java.util.Scanner;
public class Average_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int[] score  = new int[5];
        for(int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
        }

        for(int i = 0; i < score.length; i++){
            if(score[i] < 40){
                score[i] = 40;
            }
            total = total +  score[i];
        }
        System.out.println(total/score.length);

    }
}
