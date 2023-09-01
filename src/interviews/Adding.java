package interviews;

public class Adding {
	
	static  int add(int a, int b)
	{
		for(int i=1; i<=b;i++)
		{
			a++;
		}
		
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=add(10,20);
		System.out.println(a);
		
		
	}

}
