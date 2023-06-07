package Practice2;

public class FibonacciByRecursion {

	static int a=0,b=1,c;
	public static void main(String[] args) {
		 
		System.out.print(" " + a  +  " "+b);

		FibonacciByRecursion ob= new FibonacciByRecursion();
		ob.print(10);
		
	} void print(int no) {
		if(no>=1) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			print(no-1);
		
	}
	}
	

}
