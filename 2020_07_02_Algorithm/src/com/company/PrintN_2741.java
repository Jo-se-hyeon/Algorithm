package com.company;
//백준 2741 N찍기 입력한 N까지의 자연수 출력
import java.util.Scanner;
public class PrintN_2741 {
    public static void main(String[] args) {
        int N = (new Scanner(System.in)).nextInt();

        for (int i = 1; i <= N; i++){
            System.out.println(i);
        }
    }
}
