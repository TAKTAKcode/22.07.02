package com.tak.average;

import java.util.Scanner;

public class AverageCalculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("시험 본 과목 개수를 입력하세요 : " );
        int N = sc.nextInt();
        int A[] = new int[N];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for(int i = 0; i < N; i++) {
            if(A[i] > max) max = A[i];
            sum = sum + A[i];

        }

        System.out.println(sum * 100.0 / max / N);
    }
}
