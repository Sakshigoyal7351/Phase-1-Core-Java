package collection_frameworks;

import java.util.LinkedList;

class Employee
{
	int enpid;
	String name;
	double salary;
	public Employee(int enpid, String name, double salary) {
		super();
		this.enpid = enpid;
		this.name = name;
		this.salary = salary;
	}
	
	
}



public class Linkedlist2 {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(101,"Abhay",50000);
		Employee emp2 = new Employee(102, "Lila", 80000);
		Employee emp3 = new Employee(103,"Rozen",150000);
		
		
		
		LinkedList<Employee> e1 = new LinkedList<Employee>();
		e1.add(emp1);
		e1.add(emp2);
		e1.add(emp3);
		
		for(Employee e:e1)
		{
			System.out.println(e.enpid+"  "+e.name+"  "+e.salary);
		}

	}

}
