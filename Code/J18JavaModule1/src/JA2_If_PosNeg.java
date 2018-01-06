import java.util.*;

public class JA2_If_PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 34;
		if(A > 0) {System.out.println("A is positive.");}
		else {System.out.println("A is negative");}
		//extension
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number = inp.nextInt();
		
		if (number == 0) {System.out.println("Number is neither positive nor negative.");
	}
		else if (number > 0) {System.out.println("Number is positive.");
	}
		else {System.out.println("Number is negative.");
	}
		}
		}