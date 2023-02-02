package com.operators;

import java.util.Scanner;

public class CheckCharacter 
{

	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = ss.next().charAt(0);
		if((ch>='A')&&(ch<='Z'))
		{
			System.out.println("The Entered character is Alphabet");
		}
		else if((ch>='a')&&(ch<='z'))
		{
			System.out.println("The Entered character is alphabhet");
		}
		else if((ch>='0')&&(ch<='9'))
		{
			System.out.println("The Entered character is Digit");
		}
		else
		{
			System.out.println("The Entered character is Special Character");
		}
	}

}
