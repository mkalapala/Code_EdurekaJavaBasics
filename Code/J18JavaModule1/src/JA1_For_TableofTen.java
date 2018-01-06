import java.util.Scanner;

public class JA1_For_TableofTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mult = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = mult.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
