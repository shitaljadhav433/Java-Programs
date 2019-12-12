
import java.lang.*;
public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2,str3;
		boolean val;
		int vall;
		
		str1="abcaabbcc";
		str2="abcaabbcc";
		str3="xyz";
		
		//Length of String
		System.out.print("\nLength of String is : "+str1.length());
		
		//Replace function of string
		System.out.print("\nNew String is : "+str1.replace('a','s'));
		
		//Equals function of string
		val=str1.equals(str2);
		if(val==true) {
			System.out.print("\nStrings are equal...");
		}
		else {
			System.out.print("\nStrings not equal...");
		}
		
		//Concatenation function of string
		System.out.print("\nConcatenation of string is : "+str1.concat(str3));
		
		//Split function of String
		System.out.print("\nSubstring is : "+str1.substring(2, 6));

		//CompareTo function of String
		vall=str1.compareTo(str2);
		System.out.print("\nValue of compared strings is : "+vall);
	}

}
