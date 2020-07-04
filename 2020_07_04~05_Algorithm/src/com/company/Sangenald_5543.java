package com.company;
//백준 5543 상근날드 가격설정 후 가장 적은 값의 세트메뉴 계산
import java.util.Scanner;
public class Sangenald_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowB = 0, lowD = 0;
        int[] price  = new int[5];
        for(int i = 0; i < price.length; i++){
            //버거 3개, 음료 2개의 가격 설정
            price[i] = sc.nextInt();
        }

        lowB = (price[1] > price[0])&&(price[2] > price[0])?price[0] : (price[1] > price[2]?price[2]:price[1]);
        lowD = price[3] < price[4] ? price[3] : price[4];

        System.out.println(lowB + " " +  lowD);
        System.out.println((lowB+lowD)-50);
    }
}
