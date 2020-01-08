package Classes;

public class ClassTest {
	int a=10,b=25;
	
	public void add() {
		System.out.println("Addition of numbers is : "+(a+b));
	}
	
	public static void main(String args[]) {
		ClassTest c1=new ClassTest();
		c1.add();
	}

}
