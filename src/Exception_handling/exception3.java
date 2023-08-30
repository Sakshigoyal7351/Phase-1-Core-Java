package Exception_handling;

public class exception3 {

	public static void main(String[] args) {
		
		try
		{
			int n[] = {1,4,9};
			System.out.println(n[6]);
		}
		
		catch(Exception e)
		{
			System.out.println("some error in the code");
		}
		
		finally
		{
			System.out.println("important statement using finally");
		}

	}

}
