package com.bootcoding.java.basic;

import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String [] args){
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        n=sc.nextInt();
        System.out.println("The first n natural numbers are: "+n);

        for(int i=1; i<=n;i++){

            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("sum of natural no. "+n+ "term: "+sum);

    }
}
