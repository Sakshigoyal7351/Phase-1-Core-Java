package collection_frameworks;

import java.util.ArrayList;

class Student 
{
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}


public class ArrayList2 {

	public static void main(String[] args) {
		
		Student s1= new Student(1, "mabe",20);
		Student s2 = new Student(2, "neo", 21 );
		Student s3 = new Student(3, "baba",19);
		
		ArrayList<Student> list1= new ArrayList<Student>();
		
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		
		
		
		for(Student i: list1)
		{
			System.out.println("id="+i.id+"   name="+i.name+"  age="+i.age);
		}
		
		
		
		
		

	}

}
