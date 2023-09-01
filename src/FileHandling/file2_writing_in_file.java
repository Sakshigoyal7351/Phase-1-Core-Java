package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file2_writing_in_file {

	public static void main(String[] args) throws IOException {
		
		
			FileOutputStream f = new FileOutputStream("student.txt");
			f.write(10);
			f.write(20);
			f.write(25);
			f.write(40);
			
			f.close();
			
			System.out.println("data written successfully inside the file !!");
		

	}

}
