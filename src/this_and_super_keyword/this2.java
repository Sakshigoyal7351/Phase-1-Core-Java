package this_and_super_keyword;

class y
{
	void m1()
	{
		System.out.println("m1 method");
	}
	
	void m2()
	{
		System.out.println("m2 method");
		this.m1();
	}
}


public class this2 {

	public static void main(String[] args) {
		y obj= new y();
		obj.m2();

	}

}
