package ConditionalStatements;

import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("enter the number");
		num= sc.nextInt();
		
		if(num>0)
		{
			System.out.println("number is positive ");
		}
		
		int age;
		System.out.println("enter your age");
		age=sc.nextInt();
		
		
		if(age>18)
		{
		System.out.println("you are eligible !!");	
		}
		
		
		int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("number is even");
		}
		
		if(n%2==1)
		{
			System.out.println("number is odd");
		}
		
		
		
		
	}

}
