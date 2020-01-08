package Exception_Handling;

public class tryCatchExample {
	public static void main(String args[]) {

		try {
			int a;
			a = 50/0;
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero error");
		}
	}

}
