package interviews;

public class unique_E_in_Array {

	public static void main(String[] args) {
		
		int n=5;
		
		int c=0;
		int a[] = {1,1,3,2,2,3,3};
		
		
		System.out.println("unique elements are:");
		
		for(int i =0;i<n;i++)
		{
			c=0;
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(a[i]==a[j])
					{
						c++;
					}
				}
				
			}
			
			
			if(c==0)
			{
				System.out.println(a[i]);
			}
			
		}
		
		
		

	}

}
