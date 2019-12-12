
import java.util.*;
public class testHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		ht.put(10,"abc");
		ht.put(11,"auj");
		ht.put(13,"hrf");
		ht.put(14,"ade");
		
		System.out.print(ht+"\n");
		
		ht.remove(13);
		System.out.print(ht+"\n");
		
		System.out.print("Value is : "+ht.get(11));
		
		System.out.print("\nSize of hashtable is : "+ht.size());
		
		System.out.print("\nabc is present in hashtable. : "+ht.contains("abc"));
		
		System.out.print("\nsrj is present in hashtable. : "+ht.contains("srj"));

		
		ht.clear();
		System.out.print("\nAfter clearing hashtable : " +ht);

	}

}
