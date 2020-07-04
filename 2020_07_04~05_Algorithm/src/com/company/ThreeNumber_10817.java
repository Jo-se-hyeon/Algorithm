package com.company;
//백준 10817 세 수 세개의 숫자 입력후 중간 값 구하기
import java.util.Scanner;
import java.util.Arrays;

public class ThreeNumber_10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int middle = 0;
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            //세 수 설정
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);
        middle = num[num.length/2];

        System.out.println(middle);
    }
}
