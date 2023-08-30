package this_and_super_keyword;

class A
{
	int a=10;
}
class B extends A
{
	int a=20;
	public void display(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
}
public class super1 {

	public static void main(String[] args) {
		B obj = new B();
		obj.display(30);

	}

}
