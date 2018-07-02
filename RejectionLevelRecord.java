package com.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dao.CustomerDAO;

public class RejectionLevelRecord 
{
	
	RejectionLevelRecord(BufferedReader br) throws IOException  
	{
		FileWriter fr=new FileWriter("d:/errorLog.txt");
		
		Validation v = new Validation();
		CustomerMasterPojo c =new CustomerMasterPojo();
		CustomerDAO dao = new CustomerDAO();
		String s;
	
			
				while((s = br.readLine())!=null)					
				{
			
				String st[] = s.split("~",-1);
				 c.setCustomerCode(st[0]);
				 c.setCustomerName(st[1]);
				 c.setCustomerAddress1(st[2]);
				 c.setCustomerAddress2(st[3]);
				 c.setCustomerPinCode(Integer.parseInt(st[4]));
				 c.setEmailaddress(st[5]);
				 c.setContactNumber(Long.parseLong(st[6]));
				 c.setPrimaryContactPerson(st[7]);
				 c.setRecordStatus(st[8]);
				 c.setActiveInactiveFlag(st[9]);
				 c.setCreateDate(st[10]);
				 c.setCreatedBy(st[11]);
				 c.setModifiedDate(st[12]);
				 c.setModifiedBy(st[13]);
				 c.setAuthorizedDate(st[14]);
				 c.setAuthorizedBy(st[15]);


				 try {
				   
				 if(v.checkNull(st)&&v.checkName(c.getCustomerName())&&v.chaeckpinCode(c.getCustomerPinCode())&&v.checkemailFormat(c.getEmailaddress())&&v.checkContact(c.getContactNumber())&&v.checkRecordStatus(c.getRecordStatus())&&v.checkFlag(c.getActiveInactiveFlag()))
				 {
				
					 int number= dao.insertRecord(c);
						System.out.println("record inserted "+number);
							number++;
					 }
				
				 else
					{
					 for(int i = 0;i<st.length;i++)
					 {						 
						 fr.write(st[i]);           //writing in a new file
					     fr.write(" ");
						
						 
					 }
					fr.flush();
					}									 												 
					
			
			}
			
				catch(Exception e)
			
			{
					System.out.println(e);	
			
					}
	}
	}
	}			
	
