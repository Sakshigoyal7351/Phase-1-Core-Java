package encapsulation_and_abstraction_and_interfaces;

class E
{
	private int a;
	private double b;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	
	
}


public class encapsulation {

	public static void main(String[] args) {
		E obj = new E();
		
		obj.setA(100);
		obj.setB(12.5);
		System.out.println(obj.getA());
		System.out.println(obj.getB());

	}

}
