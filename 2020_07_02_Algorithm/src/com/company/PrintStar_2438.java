package com.company;
//백준 2438 별 찍기
import java.util.Scanner;
public class PrintStar_2438 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int num = (new Scanner(System.in)).nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
