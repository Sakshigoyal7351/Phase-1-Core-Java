package Inheritance;

interface I2
{
	void m1();
}
interface I3
{
	void m2();
}

class R implements I2,I3
{

	@Override
	public void m2() {
		System.out.println("hii i am m1 method ");
		
	}

	@Override
	public void m1() {
		System.out.println("hii i am m2 method");
		
	}
	
}



public class multiple_inheritance_using_interfaces {

	public static void main(String[] args) {
		
		R obj = new R();
		obj.m1();
		obj.m2();

	}

}
