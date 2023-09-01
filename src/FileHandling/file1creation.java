package FileHandling;

import java.io.File;
import java.io.IOException;

public class file1creation {

	public static void main(String[] args) throws IOException {
		
		File f = new File("simplilearn.txt");
		
		if(f.createNewFile())
		{
			System.out.println("file created successfully!!");
		}
		else 
		
		{
			System.out.println("file is not created !!");
		}

	}

}
