package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file6_final_projecct {

	public static void main(String[] args) throws IOException {

		
		Scanner sc= new Scanner(System.in);
		boolean go=true;
		char ch;
		while(go)
		{
			do {
		System.out.println("-------------------------***************************---------------------------");
		System.out.println("operations ");
		System.out.println("1. File creation ");
		System.out.println("2. Write in the file ");
		System.out.println("3. Reading a file");
		System.out.println("4. Delete file ");
		System.out.println("5. Exit");
		System.out.println("-------------------------***************************---------------------------");
		
		System.out.println("enter your choice ?");
		int choice= sc.nextInt();
		
		switch(choice)
		{
		case 1:
			
			System.out.println("Enter the file name to create");
			String filename= sc.next();
			
			File directory = new File("C:\\Users\\LENOVO\\Desktop\\SimplilearnFiles\\"+filename+".txt"); 
			if(directory.createNewFile())
			{
				System.out.println("file "+filename+" created successfully");
			}
			else
			{
				if(directory.exists())
				{
					System.out.println("file"+filename+" Already exist");
				}
				else
				{
					System.out.println("Error in creating the file "+filename);
				}
			}
			
			break;
		
		case 2:
			
			String f2;
			
			System.out.println("enter the file name where you want to write the data ");
			f2= sc.next();
			
			FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\Desktop\\SimplilearnFiles\\"+f2+".txt");
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Write the content which you wants towrite here..!!");
			String content = sc1.nextLine();
			
			fw.write(content);
			
			System.out.println("Data written in the file successfully!");
			fw.close();
			
			break;
			
		case 3:
			System.out.println("enter the file name whose data you want to read ");
			String f3= sc.next();
			try
			{
			
			File d2=new File("C:\\Users\\LENOVO\\Desktop\\SimplilearnFiles\\"+f3+".txt");
			Scanner sc2 = new Scanner(d2);
			
			while(sc2.hasNextLine())
			{
				String line = sc.nextLine();
				System.out.println(line);
			}
			
			sc2.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
			
		case 4:
			
			System.out.println("enter the file whose data you wanna delete ");
			String f4 = sc.next();
			
			File d3 = new File("C:\\Users\\LENOVO\\Desktop\\SimplilearnFiles\\"+f4+".txt");
			
			d3.delete();
			
			if(d3.exists())
			{
				System.out.println("File deleted successfully");
			}
			else 
			{
				System.out.println("error found in deleting the file ");
			}
			break;
		
		case 5:
			go=false;
			break;
			
		default:
			System.out.println("your choice is incorrect");
		}
		System.out.println("Do you want to continueb (Y/N)");
	 ch=sc.next().charAt(0);
		
		}
			while(ch=='Y' || ch=='y');
	}

}
}