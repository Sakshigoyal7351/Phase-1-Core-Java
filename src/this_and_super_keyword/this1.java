package this_and_super_keyword;

class x
{
	int i;
	
	void set(int i)
	{
		this.i=i;
	}
	
	void show()
	{
		System.out.println(i);
	}
}


public class this1 {

	public static void main(String[] args) {
		
		x obj= new x();
		obj.set(100);
		obj.show();

	}

}
