package TwoDArray;

public class TwoD1 {

	public static void main(String[] args) {
		
		int a[][]= {{1,3,5},{2,4,5}, {3,6,2}};
		
		System.out.println("Array is:");
		
		int  i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
