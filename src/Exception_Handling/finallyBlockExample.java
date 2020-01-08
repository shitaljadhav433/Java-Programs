package Exception_Handling;

public class finallyBlockExample {
	public static void main(String args[]) {
		try {
			int a = 50/0;
			System.out.println("Value of a = ");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled....");
		}
		finally {
			System.out.println("Finally block executed.");
		}
	}
}
