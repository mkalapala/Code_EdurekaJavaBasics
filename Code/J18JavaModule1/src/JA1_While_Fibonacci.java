import java.util.Scanner;

public class JA1_While_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, num1 = 0, num2 = 1;
		System.out.println("Enter the number of elements in the sequence: ");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		sc.close();
		System.out.println("Fibonacci series of "+count+" numbers is ");
		
		int i = 1;
		while(i <= count) {
			System.out.println(num1+" ");
			int sumofprevioustwonums = num1 + num2;
			num1 = num2;
			num2 = sumofprevioustwonums;
			i++;
		}
	}

}
