import java.io.*;
public class Program3 {
	public static void main(String args[]) throws IOException {
		int a,i;
		DataInputStream in=new DataInputStream(System.in);
		
		System.out.print("Enter the number :");
		a=Integer.parseInt(in.readLine());
		
		for(i=1;i<=10;i++)
		{
			System.out.println(a+"X"+i+" = s"+a*i);
		}
	}
}
