package Selfprogrammming;

import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) {
		System.out.println("Put your Marks of 5 Subject");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Subject 1 Marks");
		float a = sc.nextFloat();
		
		System.out.println("Enter Subject 2 Marks");
		float b = sc.nextFloat();
		
		System.out.println("Enter Subject 3 Marks");
		float c = sc.nextFloat();
		
		System.out.println("Enter Subject 4 Marks");
		float d = sc.nextFloat();
		
		System.out.println("Enter Subject 5 Marks");
		float e = sc.nextFloat();
		
		System.out.println("Enter Total Subject Marks");
		float tol = sc.nextFloat();
		
		float Percentage = (a+b+c+d+e)*100/tol;
		System.out.println("Your Percentage is "+ Percentage + "%");
		
	}

}
