package this_and_super_keyword;

class A3
{
	public void m1()
	{
		System.out.println("I am in class A");
	}
}

class B3 extends A3
{
	public void m1()
	{
		System.out.println("I am in class B");
	}
	
	public void show()
	{
		super.m1();
	}
}
public class super3 {

	public static void main(String[] args) {
		B3 obj= new B3();
		obj.show();

	}

}
