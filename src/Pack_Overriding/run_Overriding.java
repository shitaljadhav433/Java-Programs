package Pack_Overriding;

public class run_Overriding extends test_Overriding{
	public void test() {
		System.out.print("\nThis is overriding method...");
	}
	
	public static void main(String args[]) {
		test_Overriding T1=new test_Overriding();
		test_Overriding R1=new run_Overriding();
		T1.test();
		R1.test();
	}

}
