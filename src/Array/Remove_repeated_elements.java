package Array;

import java.util.Scanner;

public class Remove_repeated_elements {

	public static void main(String[] args) {
		int n,i;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the total no of elements...");
		n= sc.nextInt();
		
		
		int a[] = new int[n];
		
		
		System.out.println("enter the elements of an array");
		for(i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		
		int t[] = new int[n];
		int j=0;
		
		for(i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				t[j++] = a[i];
			}
		}
		
		t[j++]=a[n-1];
		
		
		for(i=0;i<j;i++)
		{
			System.out.println(t[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		int j,k;
//		
//		for(i=0;i<n;i++)
//		{
//			for(j=i+1; j<n;j++)
//			{
//				if(a[i]==  a[j])
//				{
//					for(k=j;k<n;k++)
//					{
//						a[k]=a[k+1];
//					}
//					
//					n--;
//				}
//				
//				else
//				{
//					j++;
//				}
//			}
//		}
//		
//		
//		System.out.println("after removing repeated elements : ");
//		for(i=0;i<n;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		
		
		
	}

}
