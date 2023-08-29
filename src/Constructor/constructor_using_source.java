package Constructor;

class CA
{
	private int a;
	private int b;
	
	public CA(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//
//	public int getB() {
//		return b;
//	}
//
//	public void setB(int b) {
//		this.b = b;
//	}

	
	public void toString2() {
		System.out.println("a=" + a +" b=" + b );
	}
	
	
	
}

public class constructor_using_source {

	public static void main(String[] args) {
		
		CA obj= new CA(50,80);
		obj.toString2();
		

	}

}
