package interviews;

public class All_unique {
	
	
	static void unique_element(int b[],int m)
	{
		int i,j;
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<i;j++)
			{
				if(b[i]==b[j])
				{
					break;
				}
			}
			
			if(i==j)
			{
				System.out.println(b[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		int n=5;
		int a[] = {1,2,2,3,3};
		
		unique_element(a,n);

	}

}
