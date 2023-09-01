package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file5_project1 {

	public static void main(String[] args) throws IOException {
	
		boolean go=true;
		
		while(go)
		{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("press 1 to create a new file ");
		System.out.println("press 2 to write in a file ");
		System.out.println("press 3 to read the file ");
		System.out.println("press 4 to delete the file ");
		System.out.println("press 5 to check the file exist or not ");
		System.out.println("press 6 to exit");
		
		int ch=sc.nextInt();
		String fname;
		
		switch(ch)
		{
		case 1:
			// 1 create a new file 
			
			System.out.println("enter the file name with extension !");
		    fname=sc.next();
			File f = new File(fname);
			
			if(f.createNewFile())
				{
					System.out.println("file created successfully!!");
				}
				else 
				
				{
					System.out.println("file is not created !!");
				}
			break;
		
		case 2:
			// write in a file 
			
			System.out.println("enter the file name where you want to write the data !");
		    fname=sc.next();
		    
		    FileWriter fw = new FileWriter(fname);
		    System.out.println("enter the data which you want to write in the file..!!");
		    String data= sc.next();
			fw.write(data);
			System.out.println("Data written in the file successfully!");
			
			fw.close();
			break;
		
		case 3:
			//read the file 
			System.out.println("enter the file name whose data you want to read !");
			fname=sc.next();
			
			 f = new File(fname);
			Scanner s = new Scanner(f);
			while(s.hasNextLine())
			{
				String line=sc.nextLine();
				System.out.println(line);
			}
			
			sc.close();
			break;
			
		case 4:
			//delete the file
			System.out.println("enter the file which you wants to delete ");
			fname=sc.next();
			f = new File(fname);
			if(f.delete())
				{
				System.out.println("file deleted succesfully!!");
				}
				else
				{
					System.out.println("error found in deleting the file!!");
				}
			
			break;
			
		case 5:
			//check existance 
			System.out.println("enter the file name whose existancee you wants to check");
			fname=sc.next();
			f = new File(fname);
			if(f.exists())
			{
				System.out.println("file exists");
				
			}
			else
			{
				System.out.println("file not exists ");
			}
			break;
			
		case 6:
			go=false;
			
		default:
			System.out.println("wrong choice choose another one !!");
		}

	}
	}

}
