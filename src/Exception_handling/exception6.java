package Exception_handling;

class RadiusException extends Exception
{
	public String tostring()
	{
		return "radius can not bee negative";
	}
	
	public String getMessage()
	{
		return "radius should be positive ";
	}
}




public class exception6 {

	public static double area(int r) throws RadiusException
	{
		if(r<0)
		{
			throw new RadiusException();
		}
		
		else
		{
			double result = 3.14*r*r;
			return result;
		}
	}
	public static void main(String[] args) throws RadiusException {
		
		double c=area(-2);
		System.out.println(c);

	}

}
