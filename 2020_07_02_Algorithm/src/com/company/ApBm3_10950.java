package com.company;
//백준 10950 A + B -- 3
import java.util.Scanner;
public class ApBm3_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, num;

        num = sc.nextInt();

        for (int i = 0; i < num; i++)
        {
            A = sc.nextInt();
            B = sc.nextInt();

            System.out.println((A+B));
        }
    }
}
