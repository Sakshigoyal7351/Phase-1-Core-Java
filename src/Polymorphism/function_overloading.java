package Polymorphism;
class Test1
{
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m1(int a)
	{
		System.out.println("m1 method "+a);
	}
	public void m1(int a, int b)
	{
		System.out.println("m1 method "+"a="+a+"b="+b);
	}
	public void m1(int a, String b)
	{
		System.out.println("m1 method "+"a="+a+"b="+b);
	}
	public void m1( String b,int a)
	{
		System.out.println("m1 method "+"a="+a+"b="+b);
	}
}

public class function_overloading {

	public static void main(String[] args) {
		Test1 obj= new Test1();
		obj.m1();
		obj.m1(10);
		obj.m1(10, 20);
		obj.m1(100, "sakshi");
		obj.m1("justin", 1000);
		

	}

}
