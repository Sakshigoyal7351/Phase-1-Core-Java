package Array;

import java.util.Scanner;

public class One_D2 {

	public static void main(String[] args) {
		
//		int a[] = new int[5];
//		
//		a[0]=100;
//		a[1]=200;
//		a[2]=250;
//		a[3]=400;
//		a[4]=100;
//		
//		//System.out.println(a[2]);
//		
//		int i;
//		System.out.println("array elements are: ");
//		for(i=0;i<5;i++)
//		{
//			System.out.print(a[i]+"\t");
//		}
		
		
		// take the array elements through user
		
		int a[]= new int[6];
		int i;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the elements of array");
		for(i=0;i<a.length;i++)
		{
			a[i] =sc.nextInt();
		}
		
		System.out.println("Array elements are :");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
