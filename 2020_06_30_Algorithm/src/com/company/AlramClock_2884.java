package com.company;

import java.util.Scanner;

public class AlramClock_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M; //시간, 분

        H = sc.nextInt();
        M = sc.nextInt();
        sc.close();

        if(M < 45) { // 분이 45분보다 적은 경우
            H--; // 시간을 1시간 앞으로
            M = 60 - (45 - M); // 분은 60분 - (45분 - 지정시간) -> 시간이 바뀌었기 때문에
            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        }else {
            System.out.println(H + " " + (M-45));
        }
    }
}
