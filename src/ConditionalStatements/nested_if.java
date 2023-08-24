package ConditionalStatements;

import java.util.Scanner;

public class nested_if {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int n;
		
		System.out.println("enter the number");
		n=sc.nextInt();
		
		if((n%3)==0)
		{
			if((n%5)==0)
			{
				System.out.println("num is divisible by 5 and 3 both !!");
			}
		}

	}

}
