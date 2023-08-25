package stringss;

public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1=new StringBuffer("vjgfgfjfjfhjgh");
		
		System.out.println(s1);
		
		String s2="hello";
		
		s1=s1.append(s2);
		
		System.out.println(s1);
		
		s1.insert(2,"sakshi");
		System.out.println(s1);
		
	}

}
