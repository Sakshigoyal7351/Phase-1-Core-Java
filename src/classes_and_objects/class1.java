package classes_and_objects;

class A
{ 
	int a;
	String b;
	
	public void A() //method
	{
		System.out.println("hii i am first method!!");
	}
	
	
	public void msg2()
	{
		System.out.println("hii i am second method ");
	}
}

public class class1 {

	public static void main(String[] args) {
		
		A obj = new A();
		
		obj.a=50;
		obj.b="sakshi";
		
		System.out.println("a="+obj.a);
		System.out.println("b="+obj.b);
		
		
		obj.A();
		obj.msg2();
		
		A obj2 ;
		obj2= new A();
		
		
		obj2.a=100;
		obj2.b="Mabe";
		
		System.out.println("a="+obj2.a);
		System.out.println("b="+obj2.b);
		
		
		
		obj2.msg2();
		obj2.A();

	}

}
