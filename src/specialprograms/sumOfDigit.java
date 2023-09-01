package specialprograms;

public class sumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r, sum=0;
		int n=1534;
		int temp=n;
//		while(n!=0)
//		{
//			r=n%10;
//			n=n/10;
//			sum=sum+r;
//		}
		
		for(sum=0;n!=0;n=n/10)
		{
			r=n%10;
			sum=sum+(r*r*r);
		}
		System.out.println("sum of digit="+sum);
		
		if(sum==temp)
		{
			System.out.println("no is armstrong ");
		}
		else 
		{
			System.out.println("no \nis not armstrong ");
		}
	}

}
