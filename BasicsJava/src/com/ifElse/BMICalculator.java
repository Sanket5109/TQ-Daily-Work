package com.ifElse;

import java.util.Scanner;

public class BMICalculator 
{

	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter your Height in Ft");
		float height=ss.nextFloat();
		System.out.println("Enter your Weight in Kg");
		float weight=ss.nextFloat();
		height= height*0.3048f;
		System.out.println("height in meter :"+height);
		float bmi= weight/(height*height);
		System.out.println("BMI is :"+bmi);
		if(bmi<18)
		{
			System.out.println("normal");
		}
			else if(bmi<24)
			{
				System.out.println("Healthy");
			}
			else
			{
				System.out.println("over weighted");
			}
		}
		
		
		

	}


