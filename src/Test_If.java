import java.io.*;
public class Test_If {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int a;
		
		DataInputStream in=new DataInputStream(System.in);
		
		System.out.print("Enter Number : ");
		a=Integer.parseInt(in.readLine());
		
		if(a%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}

}
