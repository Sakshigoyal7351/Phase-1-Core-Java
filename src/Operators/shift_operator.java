package Operators;

public class shift_operator {

	public static void main(String[] args) {
		
		int num = 2;// shift this number by 2 bit // 0010 0100  1000
		//left shift 
		int result =num <<2;//1000-> 8
		
		System.out.println(result);

		int num2=8; // 1000 -> 0100 -> 0010
		
		int result2= num2 >> 2; //0010->2
		
		System.out.println(result2);
		
		
	}

}
