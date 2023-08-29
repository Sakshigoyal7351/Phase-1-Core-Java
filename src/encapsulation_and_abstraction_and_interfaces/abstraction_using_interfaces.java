package encapsulation_and_abstraction_and_interfaces;

interface I1
{
	void show();
}
class t implements I1
{

	@Override
	public void show() {
		System.out.println("hii my method is implemented ");
		
	}
	
}



public class abstraction_using_interfaces {

	public static void main(String[] args) {
		t obj= new t();
		obj.show();

	}

}
