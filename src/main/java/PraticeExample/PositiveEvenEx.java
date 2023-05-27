package PraticeExample;

import java.util.Scanner;

public class PositiveEvenEx {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=s.nextInt();

        if(num>0 && num%2==0){
            System.out.println("Positive Even");
        }
        if(num<0 && num%2==0){
            System.out.println("Negative Even");
        }
        if(num>0 && num%2!=0){
            System.out.println("Positve odd");
        }
        if(num<0 && num%2!=0){
            System.out.println("Negative odd");
        }
        if(num==0)
        {
            System.out.println("Even");
        }

    }
}
