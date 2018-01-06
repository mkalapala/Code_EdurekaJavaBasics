import java.util.Scanner;

public class JA2_If_Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age: ");
		
		age=scan.nextInt();
		
		if(age >= 18)
			System.out.println("You are eligible to vote!");
		else
			System.out.println("You are NOT eligible to vote!");

	}

}
