package Inheritance;

class F
{
	
	public void property1()
	{
		System.out.println("this is father's property ");
	}
	
}
class S extends F
{
	public void property2()
	{
		System.out.println("this is son's property ");
	}
}


public class Single_inheritance {

	public static void main(String[] args) {
		
		S obj= new S();
		obj.property1();
		obj.property2();
		
		
		F obj2= new F();
		obj2.property1();
		//obj2.property2();
	}

}
