package com.company;
//백준 1157 단어 공부
import java.util.Scanner;

public class WordStudy_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strings = sc.next().toUpperCase();

        int[] arr_N = new int[26];
        int Max = 0;
        char result = '?';

        for (int i = 0; i < strings.length();i++){
            arr_N[strings.charAt(i)-65]++;
            if (Max < arr_N[strings.charAt(i)-65]){
                Max = arr_N[strings.charAt(i)-65];
                result = strings.charAt(i);
            }
            else if (Max == arr_N[strings.charAt(i)-65]){
                result = '?';
            }
        }
        System.out.println(result);
    }
}
