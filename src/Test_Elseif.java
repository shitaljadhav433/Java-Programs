import java.io.*;
public class Test_Elseif {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int a;
		
		DataInputStream in=new DataInputStream(System.in);
		
		System.out.print("Enter value of a : ");	
		a=Integer.parseInt(in.readLine());
		
		if(a>0) {
			System.out.print("Number is positive.");
		}
		else if(a<0) {
			System.out.print("Number is Negative.");
		}
		else {
			System.out.print("Number is neither negative nor positive.");
		}
	}

}
