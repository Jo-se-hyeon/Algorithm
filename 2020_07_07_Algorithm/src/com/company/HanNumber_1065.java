package com.company;
//백준 1065 한수
import java.util.Scanner;
public class HanNumber_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hanNum = 0;
        int[] arr = new int[3];

        int X = sc.nextInt();

        for (int i = 1; i < X+1; i++){
            if(0 < i && i < 100)
                hanNum = i;
            else if(i == 1000) break;
            else {
                int j = 0, k = i;
                while (k > 0){
                    arr[j] = k%10;
                    k /= 10;
                    j++;
                }
                if (arr[0] - arr[1] == arr[1] - arr[2]){
                    hanNum++;
                }
            }
        }
        System.out.println(hanNum);
        sc.close();
    }
}
