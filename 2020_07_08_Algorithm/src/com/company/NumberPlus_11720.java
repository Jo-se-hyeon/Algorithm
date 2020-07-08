package com.company;
//백준 11720 숫자의 합
import java.util.Scanner;

public class NumberPlus_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int lineNum = sc.nextInt();
        String arr_num = sc.next();

        for (int i = 0; i < lineNum; i++){
            sum += arr_num.charAt(i) - '0';
        }
        System.out.println(sum);

    }

}
