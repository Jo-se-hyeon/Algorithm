package com.company;

import java.util.Scanner;

public class Multiplication_2588 {
    public static void main(String[] args)
    {
        int a, b, result;
        int one, ten, hun;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        one = b % 10; //일의 자리 숫자 구하기
        ten = (b % 100) / 10; //십의 자리 숫자 구하기
        hun = b / 100; // 백의 자리 숫자 구하기

        one = one * a; // (3) 세자리 자연수 곱하기 첫번째 결과값
        ten = ten * a; // (4) 두번째 결과값
        hun = hun * a; // (5) 세번째 결과값

        System.out.println(one);
        System.out.println(ten);
        System.out.println(hun);
        System.out.println(a * b);

        //System.out.println(a * (b % 10));
        //System.out.println(a * ((b % 100)/10));
        //System.out.println(a * (b / 100));
        //System.out.println(a * b);

    }
}
