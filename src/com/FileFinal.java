package com;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileFinal {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Java Full Stack Assignment!!!!\n"+
				"*********************************************\n"+
										"Developer Name:Pandian Jayaraman\n"+
										"Language Used: Java 1.8\n"
										);
					System.out.println("Please choose one of the options below:\n"+
							"*********************************************\n"+
										"1.Return the current file names\n"+
										"2.Add/Delete/Search/Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("File operations");
		String fileNm = "Pandian.txt";
		while(true) {
			System.out.println("Enter your choice 1.Add 2.Delete 3.search 4.Exit ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: 
	
				String s="Hi how are you this is the first file";
			
			//byte
			FileOutputStream fos=new FileOutputStream(fileNm);
			
			byte b[]=s.getBytes();
			fos.write(b);
			fos.close();
			break;
	
		 case 2:
			System.out.println("Please enter the name of the file to be deleted");
					//String path = "C:\\Users\\jpand\\Software\\Test\\z.txt";
					//String finalfile = path;
					File f = new File(fileNm);
					boolean flag1 = f.delete();
					if(flag1) {
						System.out.println("Selected file deleted Successfully"+f);
					}else
					{
							System.err.println("Failed to delete the file:" + f);
						
					}
					//f.close();
					break;	
				case 3:
					String path2 = "C:\\Users\\jpand\\eclipse-workspace\\JavaFullStackAssignment";
					File  f2 = new File(path2);
					System.out.println("Enter  the file name");
					String filesearch = sc.next();
					File filen1[]=f2.listFiles();
					int flag=0;
							for(File ff:filen1) {
								
									if(ff.getName().equals(filesearch)) {
										flag =1;
										break;
									}
									else {
										flag = 0;
									}
							}
							if(flag ==1) {
								
								System.out.println("File is found ");
							}
							else {
								System.out.println("File is not found ");
							}
							break;
				case 4:
					System.exit(0);
					break;			
			}
	}


	}
}