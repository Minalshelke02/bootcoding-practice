package com.bootcoding.java.basic;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        int n;
        double sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + 1 / i;

            }
            System.out.println("Sum of Series upto 5 terms :" + sum );

    }
}

