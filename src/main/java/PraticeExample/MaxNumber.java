package PraticeExample;

import java.util.Scanner;

public class MaxNumber {
    public static void main (String args[]){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter No:");
         a=sc.nextInt();
         System.out.println("Enter no:");
         b=sc.nextInt();
         System.out.println("Enter no:");
         c=sc.nextInt();

         if(a>b && a>c){

          {
             System.out.println(" Maximum value of three integer is: "+ a);
          }
        if(b>a && b>c)
         {
            System.out.println(" Maximum value of three integer is: "+ b);
        }
        if(c>a && c>b)
        {
            System.out.println(" Maximum value of three integer is: "+ c);
        }
    }
        else{
            System.out.println(" all are same");

        }
    }
}
