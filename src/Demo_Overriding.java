class Demo1{
	public void test() {
		System.out.print("\nThis is method from super class.");
	}	
}
public class Demo_Overriding extends Demo1{
	
	public void test() {
		System.out.print("\nThis is overriding method");
	}
	
	public static void main(String args[]) {
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo_Overriding();
		d1.test();
		d2.test();
	}
}
