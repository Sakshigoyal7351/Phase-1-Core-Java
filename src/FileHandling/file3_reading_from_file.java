package FileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class file3_reading_from_file {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Simplilearnfilehandling.txt");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(f));
		
//		String line;
//		
//		while((line=reader.readLine())!=null)
//		{
//			System.out.println(line);
//		}
		
		
		int character;
		
		
		while((character=reader.read())!=-1)
		{
			System.out.print((char)character);
		}
		
		
		
		
		reader.close();
		f.close();
	}

}
