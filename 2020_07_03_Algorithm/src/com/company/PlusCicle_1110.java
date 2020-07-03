package com.company;
//백준 1110 더하기 사이클
import java.util.Scanner;
public class PlusCicle_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initnum = sc.nextInt();
        sc.close();
        int num = initnum, count = 0;

        while (true){
            int first = initnum/10;
            int second = initnum%10;
            int sum = first + second;

            initnum = second*10 + sum%10;
            count++;
            if(initnum == num)
                break;
        }
        System.out.println(count);
    }
}
