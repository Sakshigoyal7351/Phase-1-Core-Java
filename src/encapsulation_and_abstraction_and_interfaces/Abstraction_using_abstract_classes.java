package encapsulation_and_abstraction_and_interfaces;

abstract class vehicle
{
	abstract void start();
}

class car extends vehicle
{

	
	void start() {
		System.out.println("it starts with a key");
		
	}
	
}

class scooter extends vehicle 
{

	@Override
	void start() {
		System.out.println("it starts with a kick");
		
	}
	
}
public class Abstraction_using_abstract_classes {

	public static void main(String[] args) {
		
		car obj= new car();
		obj.start();
		scooter obj2 = new scooter();
		obj2.start();
		

	}

}
