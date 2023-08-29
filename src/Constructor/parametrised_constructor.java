package Constructor;

class C
{
	C()
	{
		System.out.println("hii i am no- arg constructor ");
	}
	
	C(int a, String b)
	{
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
	}
}

public class parametrised_constructor {

	public static void main(String[] args) {
		
		
		C obj= new C();
		
		C obj2 = new C(20,"Justin");
		

	}

}
