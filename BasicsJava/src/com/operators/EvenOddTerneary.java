package com.operators;

import java.util.Scanner;

public class EvenOddTerneary 
{

	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter number");
		int num = ss.nextInt();
		System.out.println("Number is :"+((num%2==0)?"is Even":"is odd"));		
		

	}

}
