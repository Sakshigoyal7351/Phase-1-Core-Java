package this_and_super_keyword;

class z
{
	z()
	{
		this(100);
		System.out.println("hii i am no-arg constructor");
	}
	
	z(int a)
	{
		
		System.out.println("hii i am parametrised constyructor"+a);
	}
}

public class this3 {

	public static void main(String[] args) {
		z obj = new z();
		
		
		

	}

}
