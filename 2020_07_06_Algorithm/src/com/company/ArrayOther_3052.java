package com.company;
//백준 3052 나머지 임의의 숫자를 % 42 연산 후 결과값에 나머지를 비교하여 서로 다른값의 개수 출력
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOther_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int count = 0;

        for(int i = 0;i < num.length;i++){
            num[i] = sc.nextInt()%42;
            //num[i] = num[i]%42;
        }
        Arrays.sort(num);

        for(int i = 0;i < num.length-1;i++){
            if(num[i] == num[i+1]){
                count++;
            }
        }
        System.out.println(num.length-count);
    }
}
