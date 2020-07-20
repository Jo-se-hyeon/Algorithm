package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class coin0_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0, won = 0;

        cnt = sc.nextInt();
        won = sc.nextInt();

        Integer[] coin = new Integer[cnt];


        for (int i = 0; i < coin.length; i++){
            coin[i] = sc.nextInt();
        }
        int result = min_count(won, coin);
        System.out.println(result);


    }
    public static int min_count(int value, Integer[] coin_list){
        int total_coin_count = 0;
        Arrays.sort(coin_list, Collections.reverseOrder());

        for (int i = 0; i < coin_list.length; i++){
            int coin_num = value/coin_list[i];
            total_coin_count += coin_num;
            value -= coin_num*coin_list[i];
        }
        return total_coin_count;
    }
}
