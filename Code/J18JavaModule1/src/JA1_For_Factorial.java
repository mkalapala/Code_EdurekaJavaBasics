import java.util.Scanner;

public class JA1_For_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, c, fact = 1;
		
		System.out.println("Enter a number for factorial calculation: ");
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		
		if(n < 0)
			System.out.println("Number should be positive.");
		else {
			for(c = 1; c <= n ; c++)
				fact = fact*c;
			System.out.println("Factorial of "+n+" is "+fact);
			
		}
		
	}

}
