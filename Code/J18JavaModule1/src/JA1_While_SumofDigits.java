import java.util.Scanner;

public class JA1_While_SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		int inp = num;
		while(inp != 0) {
			int finaldigit = inp % 10;
			sum += finaldigit;
			inp /= 10;
		}
		System.out.println("Sum of digits of entered number is: "+sum);
	}

}
