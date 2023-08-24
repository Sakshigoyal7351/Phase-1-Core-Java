package ConditionalStatements;

import java.util.Scanner;

public class if_else_if {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		int n;
//		System.out.println("enter the number");
//		n=sc.nextInt();
//		
//		if(n>0)
//		{
//			System.out.println("no is positive !!");
//		}
//		else if(n<0)
//		{
//			System.out.println("no is negative !!");
//		}
//		else 
//		{
//			System.out.println("no is zero !!");
//		}
		
		
		int a,b,c;
		System.out.println("enter the value of a ");
		a=sc.nextInt();
		
		System.out.println("enter the value of b ");
		b=sc.nextInt();
		
		System.out.println("enter the value of c ");
		c=sc.nextInt();
		
		if((a>b)&&(a>c))
		{
			System.out.println("a is grater");
		}
		
		else if((b>a)&&(b>c))
		{
			System.out.println("b is grater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
