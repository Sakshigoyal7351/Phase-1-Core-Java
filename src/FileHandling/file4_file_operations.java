package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file4_file_operations {

	public static void main(String[] args) throws IOException {
		//1. create a file 
		//2 write in to the file 
		//3. read the file 
		//4. delete the file 
		//5. check the file it exist or not
		
		
		File f = new File("Fileop.txt");
		
		//1. create a new file
//		if(f.createNewFile())
//		{
//			System.out.println("file created successfully!!");
//		}
//		else 
//		
//		{
//			System.out.println("file is not created !!");
//		}
		
		
		//2. Write into the file
//		FileWriter fw = new FileWriter("Fileop.txt");
//		fw.write("Hii this is my first file i have created !! the data is updated successfully !!!");
//		System.out.println("Data written in the file successfully!");
//		
//		fw.close();
		
		//3. read the file 
//		
//		Scanner sc = new Scanner(f);
//		while(sc.hasNextLine())
//		{
//			String line=sc.nextLine();
//			System.out.println(line);
//		}
//		
//		sc.close();
		
		//4. Delete the file 
		
		
//		if(f.delete())
//		{
//		System.out.println("file deleted succesfully!!");
//		}
//		else
//		{
//			System.out.println("error found in deleting the file!!");
//		}
		
		
		//5. check the file exist or not
		
		if(f.exists())
		{
			System.out.println("file exists");
			
		}
		else
		{
			System.out.println("file not exists ");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
