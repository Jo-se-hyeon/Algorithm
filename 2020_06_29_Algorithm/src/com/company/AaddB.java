package com.company;
//백준 1000, 1001, 10998, 1008, 10869 A+B A-B AxB A/B 사칙연산
import java.util.Scanner;
public class AaddB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B;
        //double A, B; // 1008 더 정확한 값을 위해 소수 자료형 선언
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.println(A + B); //덧셈
        System.out.println(A - B); //뺄셈
        System.out.println(A * B); //곱하기
        System.out.println(A / B); //나누기
        System.out.println((A % B)); //나머지 연산
    }
}
