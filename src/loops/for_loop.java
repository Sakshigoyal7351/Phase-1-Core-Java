package loops;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		
		
		//(print hello world 100 times )
//		int i;
//		for(i=1;i<=5;i++)
//		{
//			System.out.println("Hello world!!");
//		}
		
		
		//print series from 1 to 100
//		int i;
//		for(i=1;i<=100;i++)
//		{
//			System.out.println(i);
//		}
//		
		
		//reverse series from 50 to 1
//		int i;
//		for(i=50;i>=1;i--)
//		{
//			System.out.println(i);
//		}
		
		//even num series from 1 to 100
//		int i;
//		for(i=1;i<=100;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//		}
//		
		
		
//		int i;
//		for(i=1;i<=100;i=i+2)
//		{
//			System.out.println(i);
//		}
		
		
		//sum of series from 1 to 5
		
//		int i,sum=0;
//		for(i=1;i<=5;i++)
//		{
//			System.out.println(i);
//			sum=sum+i;
//			
//		}
//		System.out.println("sum of series ="+sum);
		
		//sum of even num series from 1 to 100
		
//		int i, sum=0;
//		for(i=0;i<=100;i=i+2)
//		{
//			System.out.println(i);
//			sum=sum+i;
//			
//		}
//		
//		System.out.println("sum of even num series is :"+sum);
		
		
		//table printing program 
		
//		Scanner sc= new Scanner(System.in);
//		
//		int i,n, t=0;
//		System.out.println("enter any number");
//		n=sc.nextInt();
//		for(i=1;i<=10;i++)
//		{
//			t=n*i;
//			System.out.println(n+"x"+i+"="+t);
//		}
		
		//factorial of any number
		Scanner sc= new Scanner(System.in);
		
		int i,n,f=1;
		System.out.println("enter any number");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		
		System.out.println("factorial of the number is "+f);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
