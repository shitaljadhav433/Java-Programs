import java.io.*;
public class Program7 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		int a,b,c;
		DataInputStream in=new DataInputStream(System.in);	

		System.out.print("Enter value of a : ");
		a=Integer.parseInt(in.readLine());
		
		System.out.print("Enter value of b : ");
		b=Integer.parseInt(in.readLine());
		
		c=a+b;
		
		System.out.print("Addition of numbers is : " +c);
		
	}
}
