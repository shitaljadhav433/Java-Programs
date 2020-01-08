package Loop;

public class ForLoop {
	
	public static void main(String args[]) {
		
		//Increment
		for(int i=0;i<=4;i++) {
			System.out.println("Count is : "+i);
		}
		System.out.print("\n");
		
		//Decrement
		for(int i=4;i>=0;i--) {
			System.out.println("Count is : "+i);
		}
		System.out.print("\n");
		
		//Incremented by 2
		for(int i=0;i<=8;i+=2) {
			System.out.println("Count is : "+i);
		}
		System.out.print("\n");
		
		//Decremented by 2
		for(int i=8;i>=0;i-=2) {
			System.out.println("Count is : "+i);
		}
		System.out.print("\n");
	}

}
