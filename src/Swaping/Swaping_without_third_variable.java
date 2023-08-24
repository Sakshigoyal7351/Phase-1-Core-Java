package Swaping;

public class Swaping_without_third_variable {

	public static void main(String[] args) {
		
		int a=50;
		int b=60;
		
		System.out.println("before swapping :");
		System.out.println("value of a ="+a);
		System.out.println("value of b="+b);
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		
		System.out.println("after swapping :");
		System.out.println("value of a ="+a);
		System.out.println("value of b="+b);
		

	}

}
