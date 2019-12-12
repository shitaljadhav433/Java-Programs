import java.io.*;
public class Program4 {
	public static void main(String args[]) throws IOException 
	{
		int a,b,res,ch;
		
		DataInputStream in=new DataInputStream(System.in);
		
		System.out.println("Enter First Number :");
		a=Integer.parseInt(in.readLine());
		
		System.out.println("Enter Second Number :");
		b=Integer.parseInt(in.readLine());
		
		do
		{
			System.out.println("1.Addition\n");
			System.out.println("2.Subtraction\n");
			System.out.println("3.Multiplication\n");
			System.out.println("4.Division\n");
			System.out.println("5.Exit\n\n");
			System.out.println("Enter Your Choice :\n");
			
			ch=Integer.parseInt(in.readLine());
			
			switch(ch) 
			{
			case 1:
				res=a+b;
				System.out.println("Addition of Numbers is : "+res);
				break;
			case 2:
				res=a-b;
				System.out.println("Subtraction of Numbers is : "+res);
				break;
			case 3:
				res=a*b;
				System.out.println("Multiplication of Numbers is : "+res);
				break;
			case 4:
				res=a/b;
				System.out.println("Division of Numbers is : "+res);
				break;
			case 5:
				System.out.println("Exit....");
				break;	
			}
		}while(ch!=5);
	}
}
