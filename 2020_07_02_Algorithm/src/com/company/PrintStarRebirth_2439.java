package com.company;
//백준 2349 별 찍기 거꾸로
import java.util.Scanner;
public class PrintStarRebirth_2439 {
    public static void main(String[] args) {
        int num = (new Scanner(System.in)).nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = num; j > 0;j--){
                if(i<j){
                    System.out.print(" ");
                }else
                    System.out.print("*");

            }
            System.out.println("");
        }
    }
}
