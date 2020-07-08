package com.company;
//백준 11654 아스키코드 출력
import java.util.Scanner;

public class ASCII_11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int c = a.charAt(0);
        System.out.println(c);
    }
}
