package com.company;
//백준 10996 별 찍기 - 21 행의 갯수는 num*2, 짝수냐 홀수냐에 따라 별, 공백 출력
import java.util.Scanner;
public class PrintStar21_10996 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        for(int i = 1; i <= num * 2; i++){
            for(int j = 1; j <= num; j++){
                if(i % 2 == 0) {
                    if(j % 2 == 0){
                        System.out.print("*");
                    }else
                        System.out.print(" ");
                }else{
                    if (j % 2 == 0)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
