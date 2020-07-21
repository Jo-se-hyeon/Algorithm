package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Atm_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] p = new int[cnt];

        int result = 0;
        int last = 0;

        for (int i = 0; i< p.length; i++){
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        for (int i = 0; i < cnt; i++){
            result += (last + p[i]);
            last += p[i];
        }

        System.out.println(result);
    }
}
