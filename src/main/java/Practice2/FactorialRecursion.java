package Practice2;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public class FactorialRecursion {

	static int fact=1;
	public static void main(String[] args) {
		
		int no=6;
		FactorialRecursion obj=new FactorialRecursion();
		obj.calFact(no);
		System.out.println("Factorial of "  +no+ " is " + fact);
		

	}
	void calFact(int no) {
		if(no>=1) {
		fact=fact*no;
		     calFact(no-1);
		}
	}

}
