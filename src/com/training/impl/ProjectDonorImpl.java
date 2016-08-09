package com.training.impl;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.training.entity.Donor;
import com.training.entity.Project;
import com.training.ifaces.IProject_Donor;
import com.training.utils.MySQLConnection;

public class ProjectDonorImpl implements IProject_Donor {
	Connection con = null;
	
	/**
	 * 
	 */
	public ProjectDonorImpl() {
		super();
		con = MySQLConnection.getMyOracleConnection();
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addProject_Donor(Donor dnr, Project prj) {
		// TODO Auto-generated method stub
		boolean check = false;
		try{
			String sql = "BEGIN addDonor(?,?,?); END;";
			//PreparedStatement pstmt = con.prepareStatement(sql);
			CallableStatement pstmt = 
				      con.prepareCall("{call addDonor(?,?,?)}");


			
			pstmt.setInt(1, obj.getDonor_Id());
			pstmt.setString(2, obj.getDonor_Name());
			pstmt.setString(3, obj.getDonor_Email());
            //rowAdded = pstmt.executeUpdate();
		    check = pstmt.execute();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return check;
		
		
		return false;
	}

	@Override
	public Project getProject_Donor(Donor dnr) {
		// TODO Auto-generated method stub
		return null;
	}

}
