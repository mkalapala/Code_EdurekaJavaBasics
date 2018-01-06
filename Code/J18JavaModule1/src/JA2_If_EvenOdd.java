import java.util.*;

public class JA2_If_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eo = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		int num = eo.nextInt();
		
		if(num%2 == 0) {System.out.println("The number is EVEN.");}
		else {System.out.println("The number is ODD.");}
	}

}
