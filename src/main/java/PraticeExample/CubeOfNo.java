package PraticeExample;

import java.util.Scanner;

public class CubeOfNo {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
          int cube=i * i * i;

            System.out.println("Number is : " + i + "  and cube of the " + i + "is " + cube);
        }
    }
}


