import java.util.*;

public class JA2_If_LargerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, larger;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers.");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a>b) {larger = a;}
		else {larger = b;}
		
		System.out.println("The larger of the two numbers is "+larger);

	}

}
