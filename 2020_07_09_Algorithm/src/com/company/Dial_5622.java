package com.company;
//백준 5622 다이얼
import java.util.Scanner;
public class Dial_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inNum = sc.nextLine();

        char[] arr = inNum.toCharArray();
        int sum = 0;

        //for each 문 배열에 값을 c에 넣어 하나씩 증가하면서 반복한다.
        for (char c : arr){
            sum += Dial(c) + 1;
        }

        System.out.println(sum);
    }
    public static int Dial(char inNum){
        switch (inNum){
            case 'A' : case 'B' : case 'C' :
                return 2;
            case 'D' : case 'E' : case 'F' :
                return 3;
            case 'G' : case 'H' : case 'I' :
                return 4;
            case 'J' : case 'K' : case 'L' :
                return 5;
            case 'M':case 'N':case 'O':
                return 6;
            case 'P':case 'Q':case 'R':case 'S':
                return 7;
            case 'T':case 'U':case 'V':
                return 8;
            case 'W':case 'X':case 'Y':case 'Z':
                return 9;
            default:
                return -1;
        }
    }
}
