package com.company;
// 백준 2742 N찍기 역으로
import java.util.Scanner;
public class PrintNRebirth_2742 {
    public static void main(String[] args) {
        int N = (new Scanner(System.in)).nextInt();

        for (int i = 0; i < N; i++){
            System.out.println(N-i);
        }
    }
}
