package com.filehandling;

public class Validation {
  
boolean endWithFormat(String s )
{
 if(s.endsWith(".txt"))
	{
		return true;
     }
	return false;
}
boolean checkName(String s)
{

 if(s.matches("[A-Za-z 0-9]+"))
		return true;
	else
		return false;
}
boolean chaeckpinCode(int i){
	int j=String.valueOf(i).length();
	if(j==6)
		return true;
	else
		return false;
}
boolean checkemailFormat(String email){
	
	 if((email.contains("@"))&&(email.endsWith(".com"))&&(email.isEmpty()==false))
	 {
		 return true;
	}
	 System.out.println("Error in Email");
	 System.out.println(email);
	return false;
}
public boolean checkNull(String s[])
{
	if(s[0].isEmpty()&&s[1].isEmpty()&&s[2].isEmpty()&&s[4].isEmpty()&&s[5].isEmpty()&&s[7].isEmpty()&&s[8].isEmpty()&&s[8].isEmpty()&&s[9].isEmpty()&&s[10].isEmpty()&&s[11].isEmpty())
	return false;

	return true;
}
public boolean checkContact(Long i)
{
	int j = String.valueOf(i).length();
	if(j==10)
	return true;
	else
	return false;
}	
boolean checkRecordStatus(String s)
{
	if(s.charAt(0)=='N'||s.charAt(0)=='M'||s.charAt(0)=='D'||s.charAt(0)=='A'||s.charAt(0)=='R')
	return true;
	return false;
}
boolean checkFlag(String s)
{
	if(s.charAt(0)=='A'||s.charAt(0)=='I')
	return true;
	return false;
}

}


