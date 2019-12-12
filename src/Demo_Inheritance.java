class Demo{
	
	public void print(){
		System.out.print("\nHello, this is super class.");
	}
}
public class Demo_Inheritance extends Demo {
	
    public void print1() {
    	System.out.print("\nHello, this is sub class");    
    }
    
    public static void main(String args[]) {
    	Demo_Inheritance d1=new Demo_Inheritance();
    	d1.print();
    	d1.print1();
    }
}
