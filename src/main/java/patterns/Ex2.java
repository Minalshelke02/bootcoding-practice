package patterns;

public class Ex2 {
    public static void main(String args[]){
        int  number, n=4;
        for(int i=0; i<n; i++)
        {
            number=1;
//loop for columns
            for(int j=0; j<=i; j++)
            {
//prints num
                System.out.print(number+ " ");
//incrementing the value of number
                number++;
            }
// at the next line after printing each row
            System.out.println();
        }
    }
}
