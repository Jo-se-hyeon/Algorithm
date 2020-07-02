package com.company;
// 백준 15552 빠른 A + B 처리 시간을 줄이기 위해 버퍼 사용
import java.io.*;
import java.util.StringTokenizer;

public class FastApB_15552 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());
        int A = 0, B = 0;

        for (int i = 0; i < num ; i++) {
            StringTokenizer st = new StringTokenizer((bf.readLine()));
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            bw.write(A+B + "\n");

        }
        bw.flush();
    }
}
