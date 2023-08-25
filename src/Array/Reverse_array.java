package Array;

public class Reverse_array {

	public static void main(String[] args) {
		
		int a[]= {2,3,5,7};
		int i;
		System.out.println("Array is : \n");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		System.out.println("\nReverse of an array\n");
		
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+"\t");
		}
		

	}

}
