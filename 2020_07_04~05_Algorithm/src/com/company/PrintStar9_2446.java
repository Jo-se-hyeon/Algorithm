package com.company;
//백준 2446 별 찍기 - 9
import java.util.Scanner;
public class PrintStar9_2446 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        for (int i = 0; i < num; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for(int j = (num * 2)-1; j > i * 2; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < num-1; i++){
            for (int j = num-2; j>i; j--){
                System.out.print(" ");
            }

            for (int j = 0; j < (i*2)+3; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
