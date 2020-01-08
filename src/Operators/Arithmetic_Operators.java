package Operators;

public class Arithmetic_Operators {
	public static void main(String args[]) {
		int a,b,c;
		a=20;
		b=10;
		
		//'+' Operator
		c=a+b;
		System.out.print("\nValue of a after '+' is : "+c);
		
		//'-' Operator
		c=a-b;
		System.out.print("\nValue of a after '-' is : "+c);
		
		//'*' Operator
		c=a*b;
		System.out.print("\nValue of a after '*' is : "+c);
		
		//'/' Operator
		c=a/b;
		System.out.print("\nValue of a after '/' is : "+c);
		
		//'%' Operator
		c=a%b;
		System.out.print("\nValue of a after '%' is : "+c);
		
		//'++' Operator
		a++;
		System.out.print("\nValue of a after '++' is : "+a);
				
		//'--' Operator
		b--;
		System.out.print("\nValue of a after '--' is : "+b);		
	}

}
