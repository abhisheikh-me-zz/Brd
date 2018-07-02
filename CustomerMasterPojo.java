package com.filehandling;

import java.io.Serializable;

public class CustomerMasterPojo implements Serializable {

private	 int customerId;
private String customerCode;
private	 String customerName;
private String customerAddress1;
private	 String customerAddress2;
private	 int    customerPinCode;
 private	 String emailaddress;
 private long   contactNumber;
 private   String primaryContactPerson;
 private String recordStatus;
 private String activeInactiveFlag;
 private	 String createDate;
 private	 String createdBy;
 private	 String modifiedDate;
 private	 String  modifiedBy;
 private String authorizedDate;
 private String authorizedBy;
	public int getCustomerId()
	{
		return customerId;
	}
	public String getCustomerCode() 
	{
		return customerCode;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public String getCustomerAddress1() 
	{
		return customerAddress1;
	}
	public String getCustomerAddress2() 
	{
		return customerAddress2;
	}
	public int getCustomerPinCode() 
	{
		return customerPinCode;
	}
	public String getEmailaddress()
	{
		return emailaddress;
	}
	public long getContactNumber() 
	{
		return contactNumber;
	}
	public String getPrimaryContactPerson()
	{
		return primaryContactPerson;
	}
	public String getRecordStatus()
	{
		return recordStatus;
	}
	public String getActiveInactiveFlag()
	{
		return activeInactiveFlag;
	}
	public String getCreateDate()
	{
		return createDate;
	}
	public String getCreatedBy() 
	{
		return createdBy;
	}
	public String getModifiedDate()
	{
		return modifiedDate;
	}
	public String getModifiedBy() 
	{
		return modifiedBy;
	}
	public String getAuthorizedDate()
	{
		return authorizedDate;
	}
	public String getAuthorizedBy()
	{
		return authorizedBy;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	public void setCustomerCode(String customerCode)
	{
		this.customerCode = customerCode;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
		
	}
	public void setCustomerAddress1(String customerAddress1)
	{
		this.customerAddress1 = customerAddress1;
	}
	public void setCustomerAddress2(String customerAddress2)
	{
		this.customerAddress2 = customerAddress2;
	}
	public void setCustomerPinCode(int customerPinCode)
	{
		this.customerPinCode = customerPinCode;
	}
	public void setEmailaddress(String emailaddress)
	{
		this.emailaddress = emailaddress;
	}
	public void setContactNumber(long contactNumber)
	{
		this.contactNumber = contactNumber;
	}
	public void setPrimaryContactPerson(String primaryContactPerson)
	{
		this.primaryContactPerson = primaryContactPerson;
	}
	public void setRecordStatus(String recordStatus)
	{
		this.recordStatus = recordStatus;
	}
	public void setActiveInactiveFlag(String activeInactiveFlag) 
	{
		this.activeInactiveFlag = activeInactiveFlag;
	}
	public void setCreateDate(String createDate) 
	{
		this.createDate = createDate;
	}
	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}
	public void setModifiedDate(String modifiedDate) 
	{
		this.modifiedDate = modifiedDate;
	}
	public void setModifiedBy(String modifiedBy)
	{
		this.modifiedBy = modifiedBy;
	}
	public void setAuthorizedDate(String authorizedDate)
	
	{
		this.authorizedDate = authorizedDate;
	}
	public void setAuthorizedBy(String authorizedBy)
	{
		this.authorizedBy = authorizedBy;
	}
}

