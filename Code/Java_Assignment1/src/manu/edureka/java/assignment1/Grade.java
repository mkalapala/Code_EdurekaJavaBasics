package manu.edureka.java.assignment1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args){
		Scanner marks = new Scanner(System.in);
		
		System.out.println("Enter marks for Mathematics");
		int a = marks.nextInt();
		System.out.println("Enter marks for English");
		int b = marks.nextInt();
		System.out.println("Enter marks for Science");
		int c = marks.nextInt();
		System.out.println("Enter marks for Social Science");
		int d = marks.nextInt();
		
		double totalmarks = 400;
		double studentmarks;
		double percentage;
		studentmarks = (a+b+c+d);
		percentage = (studentmarks/totalmarks)*100;
		
		if(a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100 || d < 0 || d > 100){
			System.out.println("Invalid input!");
		}
		else if(percentage < 40){
			System.out.println("You performance grade is Poor");						
		}
		else if(percentage >= 40 && percentage <= 59){
			System.out.println("You performance grade is Average");
		}
		else if(percentage >=60 && percentage <= 79){
			System.out.println("You performance grade is Good");
		}
		else if(percentage >= 80 && percentage <= 89){
			System.out.println("You performance grade is Very Good");
		}
		else if(percentage >= 90){
			System.out.println("You performance grade is Excellent");
		}
	}
}
