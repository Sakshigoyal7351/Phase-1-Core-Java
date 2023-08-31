package collection_frameworks;

import java.util.LinkedHashMap;
import java.util.Map;

class Student3
{
	int id;
	String name;
	int age;
	public Student3(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}
public class linkedhashmap2 {

	public static void main(String[] args) {
		

		Map<Integer, Student3> m1= new LinkedHashMap<>();
		
		Student3 s1= new Student3(101,"Neo",22);
		Student3 s2= new Student3(102,"Mabe",21);
		Student3 s3= new Student3(103,"baba",20);
		
		
		m1.put(1, s1);
		m1.put(2, s2);
		m1.put(3, s3);
		
		
		for (Map.Entry<Integer, Student3> entry : m1.entrySet()) {
			int key = entry.getKey();
			Student3 val = entry.getValue();
			System.out.println(val.id+"    "+val.name+"      "+val.age);
		}
		
		
		
	}

}
