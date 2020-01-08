package Operators;

public class Assignment_Operator {
	
	public static void main(String args[]) {
		int a,b,c;
		a=10;
		b=20;
		c=30;
		System.out.print("Value of a is : "+a);
		System.out.print("Value of a is : "+b);
		System.out.print("Value of a is : "+c);
		
		a=b;
		b=c;
		c=a;
		System.out.print("Value of a is : "+a);
		System.out.print("Value of a is : "+b);
		System.out.print("Value of a is : "+c);
	}

}
