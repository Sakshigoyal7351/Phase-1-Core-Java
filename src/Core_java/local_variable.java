package Core_java;

public class local_variable {
	
	public void method1()
	{
		System.out.println("hii i am method ");
	}
	
	public void method2()
	{
		int a=10; //local variables 
		int b=20; // local variables 
		System.out.println("value of a ="+a);
		System.out.println("value of b ="+b);
	}
	
	public static void main(String args[])
	{
		System.out.println("hii i am main method ");

		
		local_variable obj1 = new local_variable(); //object
		obj1.method1();
		obj1.method2();
				
	}
}
