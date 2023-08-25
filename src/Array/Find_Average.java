package Array;

import java.util.Scanner;

public class Find_Average {

	public static void main(String[] args) {
		
		int i,n;
		double avg,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of elements ");
		n=sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("enter the elements of array");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("array is : \n");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		for(i=0;i<n;i++)
		{
			sum=sum+a[i]; // sum+=a[i];
		}
		
		System.out.println("\nsum of array"+sum);
		
		avg = sum/n;
		
		System.out.println("average is : "+avg);

	}

}
