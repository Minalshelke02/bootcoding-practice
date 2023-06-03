package Practice2;

public class Example {
	

	public static void main(String[] args) {
	
		
	 int a[]=new int[] {1, 50 , 8 , 34, 8};
	 int smallest=a[0];
	 int largest=a[0];
	 
	 for(int i=0; i<a.length ;i++) {
		 
		 if(a[i]>largest)
			 largest=a[i];
		 
		 else if(a[i] < smallest)		 
			 smallest=a[i];
		 }
	 System.out.println("Largest no. is : " + largest);
	 System.out.println("Smallest no. is : " + smallest);

	 }
	 
	}

