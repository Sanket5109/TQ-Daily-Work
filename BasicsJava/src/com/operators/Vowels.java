package com.operators;

import java.util.Scanner;

public class Vowels {

	public static void main(String args[]) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = ss.next().charAt(0);
		if((ch>='A')&&(ch<='Z'))
		{
			System.out.println("Its a Alphabhet");
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println("its a vowels");
			}
			else
			{
				System.out.println("its a constrants");
			}
		}
		else if((ch>='a')&&(ch<='z'))
		{
			System.out.println("its a alphabets");
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("its a vowels...");
			}
			else
			{
				System.out.println("its a contstrants..");
			}
			
			
		}
		else if((ch>='0')&&(ch<='9'))
		{
			System.out.println("its a digit..");
			
		}
		else
		{
			System.out.println("its a special character");
		}

	}

}
