package com.bootcoding.java.basic;

import java.util.Scanner;

public class MathematicalOperation {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println( a +"+"+b +"="+add);
        System.out.println( a +"-"+b+"="+sub);
        System.out.println( a +"*"+b+"="+mul);
        System.out.println( a +"/"+b+"="+div);
        System.out.println( a +"mod"+b+"="+mod);
    }

}
