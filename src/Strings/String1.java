package Strings;

public class String1 {

	public static void main(String[] args) {
		String s1= "Simplilearn trainings"; // string literals
		
		String s2 = new String("Strings in java"); // new keyword
		
		char s3[] = {'s', 't', 'r', 'i', 'n','g'};
		String s4= new String(s3);
		
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		
		System.out.println(s1+7+8);
		System.out.println(s1+'7'+'8');
		System.out.println(s1+(7+8));
		
		String s5= s1+s2;
		System.out.println(s5);
		
		String s6= s1.concat(s2);
		System.out.println(s6);
//		
		System.out.println(s6.length());
//		
		

	}

}
