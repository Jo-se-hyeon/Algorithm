package com.company;
//백준 1330
import java.util.Scanner;
public class compare_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        if(A > B){
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }
    }
}
