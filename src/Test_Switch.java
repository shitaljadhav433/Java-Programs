import java.io.*;
public class Test_Switch {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int a,b,c,ch;
		
		DataInputStream in=new DataInputStream(System.in);
		do{		
			
		System.out.print("\n1.Addition\n");
		System.out.print("\n2.Subtraction\n");
		System.out.print("\n3.Multiplication\n");
		System.out.print("\n4.Division\n");
		System.out.print("\n5.Exit\n");

		System.out.print("\nEnter Your choice : ");
		ch=Integer.parseInt(in.readLine());
		
		System.out.print("\nEnter First value : ");
		a=Integer.parseInt(in.readLine());
		System.out.print("\nEnter Second value : ");
		b=Integer.parseInt(in.readLine());
		
		switch(ch) {
		case 1:
			c=a+b;
			System.out.print("\nAddition of numbers is:"+c);
			break;
			
		case 2:
			c=a-b;
			System.out.print("\nSubtraction of numbers is:"+c);
			break;
			
		case 3:
			c=a*b;
			System.out.print("\nMultiplication of numbers is:"+c);
			break;
			
		case 4:
			c=a/b;
			System.out.print("\nDivision of numbers is:"+c);
			break;
			
		case 5:
			System.out.print("\nExit....");
			break;
			
		}
		
		
		
	}while(ch!=5);

}
}
