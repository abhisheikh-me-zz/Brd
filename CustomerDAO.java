package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import com.filehandling.CustomerMasterPojo;

import conection.ConnectionI;
import conection.OracleConnection;

public class CustomerDAO implements CustomerDAOI {
	
	Connection conn;
	Statement stmt;
	PreparedStatement pst;
	ConnectionI c1;
public int insertRecord(CustomerMasterPojo  c) throws SQLException
{
	int j=0;
	try {
		c1 = new OracleConnection();
		c1.myConnection();	
		conn.setAutoCommit(false);
		String str="insert into CustomerMasterNsbt089 values(CustomerMasterNsbt089_sq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		pst=conn.prepareStatement(str);
		pst.setString(1,c.getCustomerCode());
		pst.setString(2,c.getCustomerName());
		pst.setString(3,c.getCustomerAddress1());
		pst.setString(4,c.getCustomerAddress2());
		pst.setInt(5,c.getCustomerPinCode());
		pst.setString(6,c.getEmailaddress());
		pst.setLong(7,c.getContactNumber());
		pst.setString(8,c.getPrimaryContactPerson());
		pst.setString(9,c.getRecordStatus());
		pst.setString(10,c.getActiveInactiveFlag());
		pst.setString(11,c.getCreateDate());
		pst.setString(12,c.getCreatedBy());
		pst.setString(13,c.getModifiedDate());
		pst.setString(14,c.getModifiedBy());
		pst.setString(15,c.getAuthorizedBy());
		pst.setString(16,c.getAuthorizedDate());
		j=pst.executeUpdate();
		
 	}catch (SQLException e) {
		e.printStackTrace();
		
	}
	return j;
}
	
	public void roll() throws SQLException 
 	{ 
	 		conn.rollback(); 
			System.out.println("rollbacked"); 
			
 	}

	public int deleteEmp ()  throws SQLException {
		int u = 0;
		 try {
		 c1=new  OracleConnection();
		 conn=c1.myConnection();
		stmt=conn.createStatement();
		 try {
			u=stmt.executeUpdate("DELETE  from CustomerMasterNsbt089");
		
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 }
		 catch(SQLException e1){
			 e1.printStackTrace();
		 }
		return 0;

}
}