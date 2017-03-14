package manu.ja3ps3;

import java.util.Scanner;

public class Select {

	public static void main(String[] args){
		
		int select = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Jill, Select a card from 1 to 10");
		select = scanner.nextInt();
		
		switch(select){
		case 1:
			System.out.println("You entered "+select);
			System.out.println("Moonlight");
			break;
			
		case 2:
			System.out.println("You entered "+select);
			System.out.println("La La Land");
			break;
			
		case 3:
			System.out.println("You entered "+select);
			System.out.println("The Revenant");
			break;
			
		case 4:
			System.out.println("You entered "+select);
			System.out.println("The Danish Girl");
			break;
			
		case 5:
			System.out.println("You entered "+select);
			System.out.println("Australia");
			break;
			
		case 6:
			System.out.println("You entered "+select);
			System.out.println("The Great Gatsby");
			break;
			
		case 7:
			System.out.println("You entered "+select);
			System.out.println("The Weeknd");
			break;
			
		case 8:
			System.out.println("You entered "+select);
			System.out.println("Sage and Gemini");
			break;
			
		case 9:
			System.out.println("You entered "+select);
			System.out.println("Shape of you");
			break;
		
		case 10:
			System.out.println("You entered "+select);
			System.out.println("Jetplanes, Islands, Tigers on a gold leash!");
			break;
			
		default:
			System.out.println("Please select from numbers 1 to 10!");
			break;
		}
		scanner.close();
		
	}

}
