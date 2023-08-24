package Operators;

public class logical_operators {

	public static void main(String[] args) {
		
		int a=40;
		int b=20;
		
		System.out.println((a<b)&&(a>50));//(40>20)&&(40>50)
		
		System.out.println((a<b)||(a>50));//(40>20)||(40>50) t
		
		System.out.println(!(a<10)); //f

	}

}
