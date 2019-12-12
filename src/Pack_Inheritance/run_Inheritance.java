package Pack_Inheritance;

public class run_Inheritance extends test_Inheritance{
	public void print1() {
		System.out.print("\nThis is from sub class");
	}
	
	public static void main(String args[]) {
		run_Inheritance I1=new run_Inheritance();
		I1.print();
		I1.print1();
	}
}
