package Exception_handling;

public class exception1 {

	public static void main(String[] args) {
		int a[]= {10, 20, 33, 40};
		
		
		
		try
		{
			System.out.println(a[6]);
		}
		catch(Exception e)
		{
			System.out.println("there is exception in your code !");
		}
	}

}
