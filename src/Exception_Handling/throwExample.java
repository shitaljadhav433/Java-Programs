package Exception_Handling;

public class throwExample {
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Age Not Valid.");
		}
		else {
			System.out.println("Valid Age");
		}
	}
	
	public static void main(String args[]) {
		validate(13);
		System.out.println("Code end....");
	}

}
