package com.company;
//백준 8958 OX퀴즈
import java.util.Scanner;

public class OXQuiz_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] Quizresult = new String[size+1];

        for(int i = 0;i < size;i++){
            int count = 0, sum = 0;
            Quizresult[i] = sc.next();
            for (int j = 0; j < Quizresult[i].length();j++){
                if (Quizresult[i].charAt(j) == 'O'){
                    sum += ++count;
                }else
                    count  = 0;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
