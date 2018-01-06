
public class JA1_DataTypesandOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10000;
		float B = (float)33.33;
		boolean withdraw;
		//using arithmetic operations and data types
		float addition = A + B;
		float subtraction = A - B;
		float multiplication = A * B;
		float division = A/B;
		
		System.out.println("Addition of A and B gives: "+ addition);
		System.out.println("Subtraction of B from A gives: "+subtraction);
		System.out.println("Multiplication of A and B gives: "+multiplication);
		System.out.println("Division of A and B gives: "+division);
		
		if (A > 500)
			withdraw = true;
		else
			withdraw = false;
		System.out.println("Can I withdraw money? " +withdraw);
		
		A++;
		B--;
		
		System.out.println("Increment of A is "+ A);
		System.out.println("Decrement of B is "+ B);

	}

}
