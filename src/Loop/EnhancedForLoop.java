package Loop;

public class EnhancedForLoop {
	 public static void main(String[] args) {
         // Array of String
		 String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};

  	// Enhanced for loop 
		 for (String dayName : days) {
			 System.out.println("Days ==> "+ dayName);
		 }
	 }
}
