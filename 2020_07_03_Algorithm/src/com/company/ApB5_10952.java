package com.company;
//백준 10952 A + B --5
import java.io.*;
import java.util.StringTokenizer;
public class ApB5_10952 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int A, B;

        while (true){
            StringTokenizer st = new StringTokenizer((br.readLine()));
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0)
                break;

            bw.write((A+B) + "\n");
        }
        bw.flush();

    }

}