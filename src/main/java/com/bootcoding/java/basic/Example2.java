package com.bootcoding.java.basic;

public class Example2 {
    public static void main(String[] agrs) {

        double width = 5.6;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2*(height + width);

        System.out.println("Area is " +width+ "+" +height + "="+ area);
        System.out.println("Perimeter is " +"2"+ "*"  +"(" +width+ "+" +height + ")"+"=" +perimeter);
    }
}

