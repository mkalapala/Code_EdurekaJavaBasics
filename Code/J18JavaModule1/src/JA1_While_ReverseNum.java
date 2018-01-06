import java.util.Scanner;

public class JA1_While_ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int reversenum = 0;
		System.out.println("Enter a number: ");
		
		Scanner inp = new Scanner(System.in);
		num = inp.nextInt();
		
		while(num != 0) {
			reversenum = reversenum *10;
			reversenum = reversenum + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse of the entered number is "+reversenum);
	}

}
