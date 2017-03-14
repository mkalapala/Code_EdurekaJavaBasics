package manu.javaassignment1.scenario2;
import java.util.Scanner;
public class Bid {
	public static void main(String[] args){
		Scanner bid = new Scanner(System.in);
		
		System.out.println("Enter Michael's bid");
		int m = bid.nextInt();
		
		System.out.println("Enter Bruce's bid");
		int b = bid.nextInt();
		
		if(m == b){
			System.out.println("Bid again!");
		}
		else if(m < b){
			System.out.println("Bruce bids higher and gets the property!");
		}
		else if(m > b){
			System.out.println("Michael bids higher and gets the property!");
		}
	}
	
}
