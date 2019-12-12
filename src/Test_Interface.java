interface interface_Test{
	public void test1();
	public void test2();
}


class test_Interface implements interface_Test{

	@Override
	public void test1() {
		System.out.print("\nThis is from first method...");
	}

	@Override
	public void test2() {
		System.out.print("\nThis is from second method...");
	}
}

public class Test_Interface{
	public static void main(String args[]) {
		test_Interface t1=new test_Interface();
		t1.test1();
		t1.test2();
	}
}
