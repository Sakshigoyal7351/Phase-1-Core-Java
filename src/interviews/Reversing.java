package interviews;

public class Reversing {

	public static void main(String[] args) {
		
		String str= "ExcelR";
		String str2 = "";
		char c;
		
		System.out.println("original string:"+str);
		
		for(int i=0; i<str.length();i++)
		{
			c = str.charAt(i);
			str2 = c+str2;
		}
		
		
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			c = str.charAt(i);
//			str2 = c+str2;
//		}
		
		
		System.out.println("reversed string is:"+str2);

	}

}
