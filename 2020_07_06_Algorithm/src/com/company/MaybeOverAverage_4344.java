package com.company;
//백준 4344 평균은 넘겠지..
import java.util.Scanner;

public class MaybeOverAverage_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseC = sc.nextInt();

        double[] avgScore = new double[caseC];

        for (int i = 0; i < caseC; i++){
            int num = sc.nextInt();

            double[] total = new double[num + 1];
            double ratio = 0;
            int count = 0;
            double sum = 0, avg;

            for (int j = 0; j < num; j++){
                total[j] = sc.nextFloat();
                sum = sum+total[j];
            }
            avg = sum/num;
            for (int j = 0; j < num; j++)
            {

                if (total[j] > avg){
                    count++;
                }
            }
            avgScore[i] = 100.0*count / num;
        }

        for (int i = 0; i < caseC; i++){
            System.out.println(String.format("%.3f", avgScore[i]) + "%");
        }
    }
}
