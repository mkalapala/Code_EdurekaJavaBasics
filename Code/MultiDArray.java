import java.io.*;
import java.util.Scanner;

public class MultiDArray {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.println("How many rows in the table?");
		int length = input.nextInt();
		
		String [] ID = new String [length];
		for(int counter = 0; counter<length; counter++) {
			System.out.println("Enter ID number "+(counter+1));
			ID[counter] = input.next();
		}
		
		String [] Name = new String[length];
		for(int counter = 0; counter<length; counter++) {
			System.out.println("Enter Name "+(counter+1));
			Name[counter] = input.next();
		}
		
		int []Salary = new int[length];
		for(int counter = 0; counter<length; counter++) {
			System.out.println("Enter Salary "+(counter+1));
			Salary[counter] = input.nextInt();
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User Name to display record.");
		String User = reader.readLine();
		
		input.close();
		
		System.out.println("ID"+"   "+"Name"+"   "+"Salary");
		display(ID, Name, Salary);
		
		System.out.print("\n\n");
		System.out.println("ID"+"   "+"Name");
		display(ID, Name);
				
		System.out.println("\n\n");
		System.out.println("You searched for "+User);
		display(User, ID, Name, Salary);
	}
	
	public static void display(String x[], String y[], int z[]) {
		for (int i = 0; i<x.length; i++) {
			System.out.println(x[i]+"   "+y[i]+"   "+z[i]);
		}
	}
	
	public static void display(String x[], String y[]) {
		for(int i = 0; i<x.length; i++) {
			System.out.println(x[i]+"   "+y[i]);
		}
	}
	
	public static void display(String m, String x[], String y[], int z[]) {
		for(int i =0; i<x.length; i++) {
			if(y[i].equals(m)) {
				System.out.println(x[i]+"   "+y[i]+"   "+z[i]);
			}
		}
	}
}
