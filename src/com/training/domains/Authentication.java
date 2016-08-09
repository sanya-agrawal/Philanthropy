package com.training.domains;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.training.utils.MySQLConnection;

public class Authentication {
	
	public static boolean authenticateDonor(String name, String email) {
		// TODO Auto-generated method stub
		Connection con = null;
		con = MySQLConnection.getMyOracleConnection();
		try{
			String sqlStr = "Select * from Donor where Donor_Name = ? AND Donor_email_id = ?";
			PreparedStatement pst = con.prepareStatement(sqlStr);
			pst.setString(1, name);
			pst.setString(2, email);
			if(pst.execute()){
				return true;
			}
			
				
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
		
	}

}
