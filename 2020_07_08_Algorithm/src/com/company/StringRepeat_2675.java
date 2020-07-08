package com.company;
//백준 2675 문자열 반복
import java.util.Scanner;
public class StringRepeat_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();

        for (int i = 0; i < caseNum; i++){
            int repeatNum = sc.nextInt();
            String strings = sc.next();

            String[] arr_S = strings.split("");
            for (int j = 0; j < arr_S.length;j ++){
                for (int k = 0; k < repeatNum; k++){
                    System.out.print(arr_S[j]);
                }
            }
            System.out.println("");
        }
    }
}
