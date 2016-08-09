package com.training.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.training.entity.Donor;
import com.training.entity.Project;
import com.training.ifaces.IDonor;
import com.training.utils.MySQLConnection;

public class DonorImpl implements IDonor {

	Connection con = null;
	public DonorImpl() {
		super();
		con = MySQLConnection.getMyOracleConnection();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addDonor(Donor obj) {
		// TODO Auto-generated method stub
		boolean check = false;
		//int rowAdded=0;
		try{
		//	String sql = "BEGIN addDonor(?,?,?); END;";
			//PreparedStatement pstmt = con.prepareStatement(sql);
			CallableStatement pstmt = 
				      con.prepareCall("{call addDonor(?,?,?)}");
			pstmt.setInt(1, obj.getDonor_Id());
			pstmt.setString(2, obj.getDonor_Name());
			pstmt.setString(3, obj.getDonor_Email());
			//pstmt.registerOutParameter(4,java.sql.Types.NUMERIC);
			//rowAdded = pstmt.getInt(4);
            //rowAdded = pstmt.executeUpdate();
		    check = pstmt.execute();
		    
		    CallableStatement stmt = 
				      con.prepareCall("{call addDonor_Project(?,?,?)}");
		    stmt.setInt(1, obj.getDonor_Id());
		    stmt.setInt(2, obj.getP_ID());
		    stmt.setInt(3, obj.getAmount_Donated());
		    stmt.execute();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return check;
		
		
		
	}

	/**
	 * 
	 */
	
	@Override
	public Project getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDonor(int d_id) {
		// TODO Auto-generated method stub
		boolean check = false;
		try{
			
			CallableStatement pstmt = 
				      con.prepareCall("{call deleteDonor(?)}");
			pstmt.setInt(1,d_id );
			check = pstmt.execute();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public int donateToProject( int d_id,int p_id, int amount) {
		// TODO Auto-generated method stub
		int rowAdded = 0;
		
		try{
			String str= "Insert into Donor_Project values (?,?,?)";
			PreparedStatement pst = con.prepareStatement(str);
			pst.setInt(1, d_id);
			pst.setInt(2,p_id);
			pst.setInt(3, amount);
			rowAdded = pst.executeUpdate();
			
			String sqlStr = "UPDATE Project SET Project_Pending_Amt = Project_Pending_Amt - ? , Amount_Collected = Amount_Collected + ? WHERE Project_Id = ?";
			PreparedStatement pstm = con.prepareStatement(sqlStr);
			pstm.setInt(1, amount);
			pstm.setInt(2, amount);
			pstm.setInt(3, p_id);
			rowAdded = pstm.executeUpdate();
			
			
			
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return rowAdded;
	}

	@Override
	public Collection<Donor> getDonorList() {
		// TODO Auto-generated method stub
		Collection<Donor> donor_list = new ArrayList<Donor>();
		try{
			String sqlString = "Select * from Donor";
			PreparedStatement pstmt = con.prepareStatement(sqlString );
		
	      ResultSet rs = pstmt.executeQuery();
	     while(rs.next())
	   {
		    donor_list.add(new Donor(rs.getInt(1),rs.getString(2),rs.getString(3)));
		   
	   }
	    for(Donor d: donor_list){
	    	 System.out.println(d);
	    	
	    }
	    	
		
		}
		catch(Exception e){
			e.printStackTrace();
		
	}
		return null;
	}


	

}
