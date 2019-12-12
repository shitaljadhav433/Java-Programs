import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> names = new ArrayList<>();

        // Adding new elements to the ArrayList
        names.add("abc");
        names.add("pqr");
        names.add("srj");
        names.add("askl");

        System.out.println("Arraylist initially : "+names);

        // Adding an element at a particular index in an ArrayList
        names.add(2, "shital");

        System.out.println("After adding new element : "+names);
        
        //Length of array
        System.out.print("\nLength of arraylist is : "+names.size()+ "\n");
        
        //COntains Function
        System.out.print("\nArraylist contains pqr : " +names.contains("pqr"));
        System.out.print("\nArraylist contains mrp : " +names.contains("mrp")+"\n");
        
        //isEmpty function
        System.out.println("\nArraylist is empty : "+names.isEmpty()+"\n");
        
        //lastIndexOf Function
        System.out.print("\nLast Index of shital is : "+names.lastIndexOf("shital"));
        System.out.print("\nLast Index of mnh is : "+names.lastIndexOf("mnh")+"\n");
        
        //indexOf Function
        System.out.println("\nIndex of shital is : "+names.indexOf("shital")+"\n");
        
        //Remove Function
        names.remove(1);
        
        System.out.println("After removing element from list : \n"+names);

    }
}