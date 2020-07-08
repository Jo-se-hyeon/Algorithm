package com.company;

import java.util.Scanner;

public class WordCount_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strings = sc.nextLine();
        String[] arr_s = strings.split("");

        int wordCount = 0;
        char sp = 32;

        for (int i = 0; i < arr_s.length; i++){
            if (arr_s[i].charAt(0) == sp){
                wordCount++;
            }
        }
        if (arr_s[0].charAt(0) != sp){
            wordCount++;
        }
        if (arr_s[arr_s.length - 1].charAt(0) == sp){
            wordCount--;
        }
        System.out.print(wordCount);
    }
}
