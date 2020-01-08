package Loop;

public class doWhileLoop {
	public static void main(String args[]) {
		int a=0;
		
		do {
			System.out.println("Count is : "+a);
			a++;
		}while(a<5);
		
		System.out.print("\n");
		//This will execute only once.
		int b=5;
		do {
			System.out.println("Count is : "+b);
		}while(b<5);
	}
}
