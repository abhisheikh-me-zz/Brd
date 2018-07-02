package com.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import dao.CustomerDAO;

public class FileLevelRejcetion {

		Validation v = new Validation(); 
		CustomerMasterPojo c =new CustomerMasterPojo();
		CustomerDAO dao = new CustomerDAO(); 
		String p; 
		 
	 FileLevelRejcetion(BufferedReader br) throws SQLException
	{ 
		try {
			while((p = br.readLine())!=null)					 
			{ 
				 
 String s[] = p.split("~",-1); 
				c.setCustomerCode(s[0]); 
			    c.setCustomerName(s[1]); 
				c.setCustomerAddress1(s[2]); 
				c.setCustomerAddress2(s[3]); 
			    c.setCustomerPinCode(Integer.parseInt(s[4])); 
				c.setEmailaddress(s[5]); 
				 c.setContactNumber(Long.parseLong(s[6]));
				 c.setPrimaryContactPerson(s[7]);
				 c.setRecordStatus(s[8]);
				 c.setActiveInactiveFlag(s[9]);
				 c.setCreateDate(s[10]);
				 c.setCreatedBy(s[11]);
				 c.setModifiedDate(s[12]);
				 c.setModifiedBy(s[13]);
				 c.setAuthorizedDate(s[14]);
				 c.setAuthorizedBy(s[15]);
			 
 try{ 
	 
		 
	 
			int number; 
			 
			if(v.checkNull(s)&&v.checkName(c.getCustomerName())&&v.chaeckpinCode(c.getCustomerPinCode())&&v.checkemailFormat(c.getEmailaddress())&&v.checkContact(c.getContactNumber())&&v.checkRecordStatus(c.getRecordStatus())&&v.checkFlag(c.getActiveInactiveFlag()))
				{ 
			 
			 
			 number= dao.insertRecord(c); 
			 System.out.println("record inserted "+number); 
			 number++;
 
 
				
		
				}
			else 
				break;
			{ 
				/*	System.out.println("delete");
			  dao.deleteEmp();
			 for(int i = 0;i<s.length;i++)
			 {
				FileWriter out = new FileWriter("d:/Fileleveltestcase.txt",true); 
				out.write(s[i]);	
				out.flush();
		*/	}
				
				
			
 
 
			}					 
 
 
				catch(Exception e) 
					{ 
						System.out.println(e); 
				}	 
 }
		dao.roll();
		} catch (NumberFormatException e) {
			
			
		} catch (IOException e) {
			
			System.out.println(e);
		}	 
	 	} 

	
	
	

}
