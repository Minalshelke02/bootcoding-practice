package PraticeExample;

import java.util.Scanner;

public class Example {
    public static void findingCount(int arr[] )
    {
        int  posCount=0;
        int negativeCount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0)
            {
                posCount++;
            }
            if(arr[i]<0)
            {
                negativeCount++;
            }
        }
        System.out.println("positive elemets count is:" +posCount);
        System.out.println("negative elemets count is:" +negativeCount);
}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" size of array");
        int size= sc.nextInt();
        System.out.println(" enter the elements of array ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        findingCount(arr);

    }
}
