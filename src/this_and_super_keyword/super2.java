package this_and_super_keyword;

class A2
{
	public void m1()
	{
		System.out.println("hii i am method of A");
	}
}

class B2 extends A2
{
	public void m2()
	{
		super.m1();
	}
}
public class super2 {

	public static void main(String[] args) {
		B2 obj = new B2();
		obj.m2();

	}

}
