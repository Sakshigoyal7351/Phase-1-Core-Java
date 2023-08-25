package Array;

import java.util.Scanner;

public class Sum_of_two_array {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n,i;
		System.out.println("enter the total elements of an array !!");
		n=sc.nextInt();
		
		int a[]= new int[n];
		
		System.out.println("enter the elemets of first array : ");
		for(i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println("first Array is : ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		int b[] = new int[n];
		
		System.out.println("\nenter the elements of second array !!");
		for(i=0;i<b.length;i++)
		{
			b[i]= sc.nextInt();
		}
		
		System.out.println("Second Array is: ");
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"\t");
		}
		
		int c[]= new int[n];
		
		for(i=0;i<c.length;i++)
		{
		c[i]= a[i]+b[i];
		}
		
		System.out.println("\nSum of two array is : ");
		
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}
		

	}

}
