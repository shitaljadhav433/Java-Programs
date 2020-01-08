package Classes;

public class Constructor {

	//Default Constructor
	public Constructor() {
		System.out.println("This is default constructor...");
	}
	
	//Parameterized Constructor
	public Constructor(int a) {
		System.out.println("Value of a is : "+a);
	}
	
	public static void main(String args[]) {
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(10);
		
	}

}
