package com.company;
//백준 1541 잃어버린 괄호
import java.util.Scanner;

public class LostBracket_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("-");

        String[] tmp = arr[0].split("\\+");
        int sum = 0;


        for (String t:tmp){
            sum += Integer.parseInt(t);
        }
        for (int i = 1; i < arr.length; i++){
            String[] temp = arr[i].split("\\+");
            for (String t : temp){
                sum -= Integer.parseInt(t);
            }
        }
        System.out.println(sum);
    }
}
