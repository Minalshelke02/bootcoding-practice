package Practice2;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		
		int n,sum=0,prod=1,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		n=sc.nextInt();
		
		while(n>0) {
			digit=n%10;
			if(digit%2==0) {
				sum=sum+digit;
			}
			else {
				prod=prod*digit;
			}
			 n=n/10;
		}
		System.out.println("sum= " +sum+ " product= "+ prod);
	}
	

}
