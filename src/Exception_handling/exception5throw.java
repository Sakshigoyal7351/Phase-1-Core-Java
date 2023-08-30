package Exception_handling;

public class exception5throw {
	
	
	static void Age(int age)
	{
		if(age <18)
		{
			throw new ArithmeticException("access denied age shopuld be 18 or 18+");
		}
		
		else
		{
			System.out.println("Access granted");
		}
		
	}

	public static void main(String[] args) {
		
		Age(17);

	}

}
