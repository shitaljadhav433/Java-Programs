package String;

public class StringMethods {
	
	public static void main(String args[]) {
		String str1="Java",str2="Programming";
		
		//String Comparison
		System.out.println("\nStr1 and str2 are equal strings. --> "+str1.equals(str2));
		
		//charAt Function
		System.out.println("\nCharacter at third position of string 2 is : "+str2.charAt(3));
		
		//Contains Function
		System.out.println("\nString contains 'Pro'.--> "+str2.contains("Pro"));
		
		//IndexOf Function
		System.out.println("\nIndex of 'gra' in string 2 is : "+str2.indexOf("g"));
		
		//Substring Function with first index
		System.out.println("\nSubstring with First index is : "+str2.substring(7));
		
		//Substring Function with First and Last Index
		System.out.println("\nSubstring with First and Last Index is : "+str2.substring(3,6));
		
		//LowerCase Function
		System.out.println("\nString 2 in Lowercase : "+str2.toLowerCase());
		
		//UpperCase Function
		System.out.println("\nString 2 in Uppercase : "+str2.toUpperCase());
		
		//Split Function
		String[] temp=str2.split("gram");
		System.out.println("\nFirst part of string after split : "+temp[0]);
		System.out.println("Second part of string after split : "+temp[1]);
		
	}
	
}
