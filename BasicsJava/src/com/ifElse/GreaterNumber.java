package com.ifElse;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner ss =new Scanner(System.in);
		System.out.println("Enter first number");
		int Num1=ss.nextInt();
		System.out.println("Enter Second number");
		int Num2=ss.nextInt();
		if(Num1>Num2)
		{
			System.out.println("num1 is greater");
		
		}
		else
		{
			System.out.println("Num2 is greater");
		}
		

	}

}
