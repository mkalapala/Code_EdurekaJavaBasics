package manu.ja3ps3;

import java.util.Scanner;

public class Manu_IO {
	
	public static void main(String[] args){
		
		int x, y, sum, difference, product;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		x = scanner.nextInt();
		System.out.println("Enter the second number: ");
		y = scanner.nextInt();
		
		sum = x + y;
		difference = x - y;
		product = x * y;
		
		System.out.println("Addition: "+sum);
		System.out.println("Subtraction: "+difference);
		System.out.println("Multiplication: "+product);
		
		scanner.close();
	}

}
