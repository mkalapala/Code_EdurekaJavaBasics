import java.util.Scanner;

public class Mod1_CaseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums;
		int ticket_price = 400;
		double discount = 0.1;
				
		Scanner tickets = new Scanner(System.in);
		System.out.println("Enter number of tickets to be purchased: ");
		nums = tickets.nextInt();
		
		int total_price = ticket_price*nums;
		double discounted_price = ticket_price*nums - ticket_price*nums*discount;
		
		if(nums <= 10) {
			System.out.println("The total cost of tickets is Rs. "+total_price);
		}
		else {
			System.out.println("The total cost of tickets is Rs. "+discounted_price);
		}
		
	}

}
