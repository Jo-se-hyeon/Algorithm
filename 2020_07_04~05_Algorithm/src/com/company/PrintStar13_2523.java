package com.company;
//백준 2523 별찍기 -13
import java.util.Scanner;
public class PrintStar13_2523 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = num-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
