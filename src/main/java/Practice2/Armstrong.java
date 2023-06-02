package Practice2;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int n;
		int rev,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		 n=sc.nextInt();
		int  num=n;
		
		while(num>0) {
			rev=num%10;
			sum=sum+ rev*rev*rev;
			num=num/10;
		}
		if(sum==n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not");
		}
		

	}

}
