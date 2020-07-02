package com.company;
//백준 2739 구구단
import java.util.Scanner;
public class multiplicationtable_2739 {
    public static void main(String[] args) {
        int num = (new Scanner(System.in)).nextInt();

        for (int i = 1; i < 10; i++)
        {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
