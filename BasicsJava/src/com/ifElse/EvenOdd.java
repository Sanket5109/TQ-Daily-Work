package com.ifElse;

import java.util.Scanner;

public class EvenOdd
{

	public static void main(String[] args)
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter number");
		int num=ss.nextInt();
		if(num%2==0)
		{
			System.out.println("Entered Number is Even :"+ num);
		
		}
		else
		{
			System.out.println("Entered Number is Odd :"+ num);
		}

	}

}
