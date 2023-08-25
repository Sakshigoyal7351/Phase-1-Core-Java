package stringss;

import java.util.Arrays;

public class getchar_tocharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s1 = "JAVA full stack";
		char dest[]=new char[15];
		
		//getchar(int srcbegin, int srcEnd, char dst[], int dstbegin)
		s1.getChars(0,15,dest,0);
		System.out.print(Arrays.toString(dest));
	
		
		String s="king";
		char d[]=s.toCharArray();
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
		
//		int i;
//		String s2="hyderabad";
//		
//		
//		char c[]=s2.toCharArray();
//		
//		for(i=0;i<s2.length();i++)
//		{
//			System.out.print(c[i]+"\t");
//		}
		
	}

}
