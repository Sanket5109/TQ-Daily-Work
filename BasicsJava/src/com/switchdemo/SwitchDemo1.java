package com.switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter month");
		int month=ss.nextInt();
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("No of days are 31");
			break;
			
			case 4:
			case 6:
			case 9:
			case 11: System.out.println("No of days are 30");
			break;
			
			case 2: System.out.println("Enter year");
			
					int year=ss.nextInt();
					if((year%400==0)||((year%100!=0)&&(year%4==0)))
					{
						System.out.println("days are 29");
					}
					else
					{
						System.out.println("days are 28");
					}
					
		}
		

	}

}
