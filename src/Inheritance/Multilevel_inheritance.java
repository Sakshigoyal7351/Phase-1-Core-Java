package Inheritance;

class GF
{
	public void p1()
	{
		System.out.println("property of grand father ");
	}
}
class F1 extends GF
{
	public void p2()
	{
		System.out.println("property of father ");
	}
	
}
class S1 extends F1
{
	public void p3()
	{
		System.out.println("property of son ");
	}
}


public class Multilevel_inheritance {

	public static void main(String[] args) {
		S1 obj = new S1();
		obj.p1();
		obj.p2();
		obj.p3();
		
		F1 obj2 = new F1();
		obj2.p1();
		obj2.p2();
		
		GF obj3 = new GF();
		obj3.p1();
		

	}

}
