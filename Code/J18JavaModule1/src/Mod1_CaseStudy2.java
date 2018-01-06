import java.util.Scanner;

public class Mod1_CaseStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numTickets = 2;
		int goldenPrice = 200;
		int silverPrice = 150;
		boolean cat;
		
		Scanner category = new Scanner(System.in);
		System.out.println("Would you like to buy the Golden category tickets?");
		cat = category.nextBoolean();
		
		if (cat == true) {
			System.out.println("The cost of your Golden category tickets is Rs. "+(numTickets*goldenPrice));
		}
		else {
			System.out.println("The cost of your Silver category tickets is Rs. "+(numTickets*silverPrice));
		}
	}

}
