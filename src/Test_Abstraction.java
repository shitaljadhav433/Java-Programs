abstract class Test{
	public abstract void test_abstraction();
	public void eat() {
		System.out.print("Eating...");
	}
}

class Demo_Abstraction extends Test{

	@Override
	public void test_abstraction() {
		System.out.println("\nThis is from abstract method");
	}
}

class Test_Abstraction{
	public static void main(String args[]) {
		Demo_Abstraction t1=new Demo_Abstraction();
		t1.eat();
		t1.test_abstraction();
	}
}

