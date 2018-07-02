package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


import dao.CustomerDAO;

public class Main
{

	public static void main(String[] args) throws Exception 
	{
		Validation v = new Validation();
		CustomerMasterPojo c =new CustomerMasterPojo();
		CustomerDAO dao = new CustomerDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of File");
		String a = sc.next();	
		if(v.endWithFormat(a))
		{
		try{
				BufferedReader br = new BufferedReader(new FileReader("C:/users/temp/desktop/"+a));
										
						
						System.out.println("Enter your Choice(Rejection level)");
						System.out.println(" R  :  for Record level Rejection ");
						System.out.println(" F  :  for File level Rejection ");
					char d = sc.next().charAt(0);
					switch(d)
					{
					case 'R' :
					        RejectionLevelRecord r = new RejectionLevelRecord(br);
					case 'F' :	
							FileLevelRejcetion f = new FileLevelRejcetion(br);
		}								
		}
		catch(Exception e){
			System.out.println("File not found");
		}
			
		}
		else
				{
					System.out.println("enter correct file with format");
				}
			
		
}
}
