package com.ifElse;

import java.util.Scanner;

public class GradeMarks 
{

	public static void main(String[] args)
	{
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter marks of sub1 ");
		int marks1=ss.nextInt();
		System.out.println("Enter marks of sub2 ");
		int marks2=ss.nextInt();
		System.out.println("Enter marks of sub3 ");
		int marks3=ss.nextInt();
		System.out.println("Enter marks of sub4 ");
		int marks4=ss.nextInt();
		System.out.println("Enter marks of sub5 ");
		int marks5=ss.nextInt();
		int total= marks1+marks2+marks3+marks4+marks5;
		System.out.println("total marks of a student :"+total);
		float per=total/5;
		System.out.println("total percentage of a student :"+per);
		if(per>85)
		{
		System.out.println("Excellent");
		}
		else if(per>70)
		{
			System.out.println("good");
		}
		else if(per>60)
		{
			System.out.println("average");
		}
		else
		{
			System.out.println("need to work hard");
		}
		
		

	}

}
