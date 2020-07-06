package com.company;
//백준 2577 숫자의 개수 결과값을 각 숫자가 몇번 사용되었는지 출력
import java.util.Scanner;
import java.util.stream.Stream;

public class NumberCount_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0, C = 0;
        int count = 0;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        int result = A*B*C;

        int[] arr_result = Stream.of(String.valueOf(result).split("")).mapToInt(Integer::parseInt).toArray();
        int[] num = new int[10];

        for(int i = 0;i < num.length;i++){
            for (int j = 0;j < arr_result.length;j++){
                if(i == arr_result[j]){
                    count++;
                }
                num[i] = count;
            }
            count = 0;
        }

        for (int i = 0; i < num.length;i++){
            System.out.println(num[i]);
        }
    }
}
