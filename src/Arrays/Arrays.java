package Arrays;

public class Arrays {

	public static void main(String[] args) {
		String [] Vehicles = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};

		//Size of the Array
		int Length = Vehicles.length;
		System.out.println("Length of the Array is ==> " + Length);

		//First element of an array 
		String BMW = Vehicles[0];
		System.out.println("First value of the Array is ==> " + BMW);

		//Last element of an Array
		String Honda = Vehicles[Length-1];
		System.out.println("Last value of the Array is ==> " + Honda);

		//Printing all values of an Array
		for(int i = 0;i<=Length-1;i++){
			System.out.println("The value at position "+i+" in array is ==> " + Vehicles[i]);
		}
	}

}
