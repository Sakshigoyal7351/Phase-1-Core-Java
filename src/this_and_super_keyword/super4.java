package this_and_super_keyword;

class A4
{
	A4()
	{
		System.out.println("I am in class A");
	}
}

class B4 extends A4
{
	B4()
	{
		super();
		System.out.println("I am in class B");
	}
}
public class super4 {

	public static void main(String[] args) {
		B4 obj= new B4();
		

	}

}
