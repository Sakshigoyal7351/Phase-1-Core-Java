package TwoDArray;

import java.util.Scanner;

public class sum_of_two_D_Array {

	public static void main(String[] args) {
		int r, c,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total num of rows");
		r=sc.nextInt();
		
		System.out.println("enter the total num of columns ");
		c= sc.nextInt();
		
		int a[][] = new int[r][c];
		
		System.out.println("enter the elements of first array!!");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("first Array is ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
      int b[][] = new int[r][c];
		
		System.out.println("enter the elements of second array!!");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Second Array is ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		int d[][]= new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				d[i][j]=a[i][j]+b[i][j];
			}
			
		}
		
		
		System.out.println("sum of two array is ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
