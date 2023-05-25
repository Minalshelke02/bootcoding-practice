package com.bootcoding.java.basic;

import java.util.Scanner;

public class Example4 {

    public static  void main(String [] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter term: ");
         n=sc.nextInt();

        for(int i=1; i<=n; i++)

        System.out.println( "Number is:" +i+ "and cube of the " +i+" is : "+(i*i*i));

    }
}
