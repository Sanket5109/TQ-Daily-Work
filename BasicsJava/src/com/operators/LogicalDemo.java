package com.operators;

import java.util.Scanner;

public class LogicalDemo {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the total marks");
		int marks=ss.nextInt();
		System.out.println("Enter marks of best three");
		int bestThree=ss.nextInt();
		/*if((marks>80)||(bestThree>90))
		{
			System.out.println("Student is eligble for college");
		}
		else {
			System.out.println("student is not eligible");*/
			
			System.out.println("result"+((marks>=80)||(bestThree>=90)?"is eligible":"is not eligible"));
		}

	}


