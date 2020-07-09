package com.company;
//백준 1316 그룹단어 체크 
import java.util.Scanner;

public class GroupCheck_1316 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check() {
        boolean[] checker = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for (int i = 0; i < str.length(); i++){
            int now = str.charAt(i);

            if (prev != now){
                if (checker[now - 'a'] == false){
                    checker[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
            else {
                continue;
            }
        }
        return true;
    }
}
