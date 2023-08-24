package ConditionalStatements;

import java.util.Scanner;

public class swith_statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int ch;
//		System.out.println("enter your choice ");
//		ch=sc.nextInt();
//		
//		switch(ch)
//		{
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default: 
//			System.out.println("you have entered wrong choice !!");
//		}
//		
		
		
		int a,b;
		System.out.println("enter a :");
		a=sc.nextInt();
		System.out.println("enter b :");
		b=sc.nextInt();
		
		System.out.println("choose 1: addition ");
		System.out.println("choose 2: subtraction");
		System.out.println("choose 3: multiplication ");
		System.out.println("choose 4: division ");
		System.out.println("choose 5: modulas ");
		
		int ch;
		System.out.println("enter your choice ");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("sum="+(a+b));
			break;
		case 2:
			System.out.println("subtraction="+(a-b));
			break;
		case 3:
			System.out.println("multiplication="+(a*b));
			break;
		case 4:
			System.out.println("division"+(a/b));
			break;
		case 5:
			System.out.println("modulas"+(a%b));
			break;
		
		default: 
			System.out.println("you have entered wrong choice !!");
		}
		

	}

}
