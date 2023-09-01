package specialprograms;

public class reverseofanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=121;
		int t=n;
		int rev=0;
		int r;
		 while(n!=0)
		 {
			 r=n%10;
			 n=n/10;
			 rev=(rev*10)+r;
		 }
		 System.out.println(rev);
		 
		 if(rev==t)
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println("not palindrome");
		 }
	}

}
