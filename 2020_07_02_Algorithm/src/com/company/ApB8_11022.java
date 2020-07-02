package com.company;
//백준 11022 A + B --8
import java.io.*;
import java.util.StringTokenizer;
public class ApB8_11022 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bf.readLine());
        int A = 0, B = 0;

        for (int i = 0; i < num ; i++) {
            StringTokenizer st = new StringTokenizer((bf.readLine()));
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            bw.write("Case #"+ (i+1) + ": " + A + " + " + B + " = " + (A+B) + "\n");

        }
        bw.flush();
    }
}
