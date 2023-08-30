package collection_frameworks;

import java.util.Iterator;
import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<>();
		
		s1.push(20);
		s1.push(30);
		s1.push(35);
		s1.push(50);
		
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(int i:s1)
		{
			System.out.println(i);
		}
		
		s1.pop();
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
