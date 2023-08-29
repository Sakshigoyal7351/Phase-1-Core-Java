package Inheritance;

class F2
{
	public void m1() {
		System.out.println("father's property");
	}
}
class D1 extends F2
{
	public void m2() {
		System.out.println("D1's property");
	}
}
class D2 extends F2
{
	public void m3() {
		System.out.println("D2's property");
	}
}


public class Hierarchical_inheritance {

	public static void main(String[] args) {
		
		D1 obj= new D1();
		obj.m1();
		obj.m2();
		
		D2 obj2 = new D2();
		obj2.m1();
		obj2.m3();
		
		F2 obj3= new F2();
		obj3.m1();

	}

}
