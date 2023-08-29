package Polymorphism;
class Test
{
	public void m1()
	{
		System.out.println("m1 method");
	}
	public void m1(int a)
	{
		System.out.println("m1 method"+"a="+a);
	}
	public void m1(int a, String b)
	{
		System.out.println("m1 method"+"a="+a+"b="+b);
	}
}
class Test3 extends Test
{
	public void m1()
	{
		System.out.println("m1 method");
	}
	public void m1(int a)
	{
		System.out.println("m1 method"+"a="+a);
	}
	public void m1(int a, String b)
	{
		System.out.println("m1 method"+"a="+a+"b="+b);
	}

}
public class function_overidding {

	public static void main(String[] args) {
		
		Test3 obj= new Test3();
		obj.m1();
		obj.m1(10);
		obj.m1(100, "jone");
	}

}
