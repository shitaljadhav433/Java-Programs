import java.io.*;
public class Test_For {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int i,j,n;
		DataInputStream in=new DataInputStream(System.in);

		System.out.print("Enter value for printing * :");
		n=Integer.parseInt(in.readLine());
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}

}
