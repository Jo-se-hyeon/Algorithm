package com.company;
//백준 1931 회의실 배정
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Meetingroom_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        Integer[][] room = new Integer[cnt][2];

        for (int i = 0 ; i < cnt; i++){
            room[i][0] = sc.nextInt();
            room[i][1] = sc.nextInt();
        }

        Arrays.sort(room, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] start, Integer[] end) {
                if(start[1] == end[1])
                    return Integer.compare(start[0], end[0]);
                return Integer.compare(start[1], end[1]);
            }
        });

        int count = 0, end = 0;
        for (int i = 0; i < cnt; i++){
            if (end <= room[i][0]){
                end = room[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
