import java.util.*;
public class testDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Printing current date
		Date d1=new Date();
		System.out.print("Current date is \n"+d1);
		
		//Printing date with milliseconds.
		Date d2=new Date(846516521258L);
		System.out.print("\nDate : \n"+d2);
		
		//after date function
		Date d3=new Date(2020, 1, 3);
		boolean a=d3.after(d1);
		System.out.print("\ndate d3 comes after d1 : "+a);

		//before date function
		boolean b=d3.before(d1);
		System.out.print("\ndate d3 comes before d1 : "+b);

		//COmpare to function 
		int c=d1.compareTo(d2);
		System.out.print("\n"+c+"\n");
		
	}

}
