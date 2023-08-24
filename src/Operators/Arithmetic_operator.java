package Operators;

import java.util.Scanner;

public class Arithmetic_operator {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		
		int java;
		System.out.println("enter the marks of java");
		java = sc.nextInt();
		
		int python;
		System.out.println("enter the marks of python ");
		python = sc.nextInt();
		
		int c;
		System.out.println("enter the marks of c language ");
		c= sc.nextInt();
		
		int total_marks;
		
		total_marks = java+python+c;
		System.out.println("total marks ="+total_marks);
		
		double percentage;
		percentage = (total_marks*100)/300;
		
		System.out.println("percentage ="+percentage);
		
		
	}
}
