package com.operators;

import java.util.Scanner;

public class NoofDaysInMonth 
{

	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Pls enter the month");
		String str=ss.next();
		{
			if((str=="Janauary"||str=="March"||str=="May"||str=="July"||str=="August"||str=="October"||str=="December"))
			{
				System.out.println("Days present in this month are: 31");
			}
			else if(str=="Feb")
			{
				System.out.println("Days present in this month are: 28");
			}
			else if((str=="April"||str=="June"||str=="Sept"||str=="Nov"))
			{
				System.out.println("Days present in this month are: 30");
			}
			ss.close();
		}

	}

}
