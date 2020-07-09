package com.company;
//백준 2908 상수 두 수를 입력받아 두 수를 뒤부터 읽는 형식으로 변환 후 비교
import java.util.Scanner;

public class SangNumber_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int int_A = change(A);
        int int_B = change(B);

        if (int_A > int_B){
            System.out.println(int_A);
        }
        else {
            System.out.println(int_B);
        }

    }
    public static int change(String str){
        String temp = "";

        for (int i = str.length()-1; i >= 0; i--){
            temp += str.charAt(i);
        }

        int num = Integer.parseInt(temp);
        return num;
    }
}
