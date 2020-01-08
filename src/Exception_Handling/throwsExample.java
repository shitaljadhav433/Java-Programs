package Exception_Handling;

import java.io.IOException;

class throwsExample1 {
	void method()throws IOException{  
		  throw new IOException("device error");  
		 }  
		} 

		public class throwsExample{  
		   public static void main(String args[]){  
		    try{  
		    	throwsExample1 m=new throwsExample1();  
		     m.method();  
		    }catch(Exception e){System.out.println("exception handled");}     
		  
		    System.out.println("normal flow...");  
		  }  

}
