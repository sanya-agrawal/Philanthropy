/**
 * 
 */
package com.training.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import com.training.entity.Donor;
import com.training.entity.Project;
import com.training.ifaces.iProject;
import com.training.utils.MySQLConnection;

/**
 * @author sagr26
 *
 */
public class ProjectImpl implements iProject {
	Connection con = null;

	/**
	 * 
	 */
	public ProjectImpl() {
		super();
		con = MySQLConnection.getMyOracleConnection();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addProject(Project obj) {
		// TODO Auto-generated method stub
		boolean check = false;
		try{
			//String sql = "BEGIN addDonor(?,?,?); END;";
			//PreparedStatement pstmt = con.prepareStatement(sql);
			CallableStatement pstmt = 
				      con.prepareCall("{call addProject(?,?,?,?,?,?,?)}");

			pstmt.setInt(1, obj.getProject_Id());
			pstmt.setString(2, obj.getProject_Name());
			pstmt.setString(3, obj.getProject_Desc());
			pstmt.setString(4, obj.getProject_Type());
			pstmt.setInt(5, obj.getProject_Cost());
			pstmt.setInt(6, obj.getProject_Pending_Amt());
			pstmt.setInt(7, obj.getAmount_Collected());
			
			
            //rowAdded = pstmt.executeUpdate();
		    check = pstmt.execute();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public Collection<Project> list_all_projects() {
		// TODO Auto-generated method stub
		Collection<Project> project_list = new ArrayList<Project>();
		try{
			String sqlString = "Select * from Project";
			PreparedStatement pstmt = con.prepareStatement(sqlString );
		
	      ResultSet rs = pstmt.executeQuery();
	     while(rs.next())
	   {
		    project_list.add(new Project(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7)));
		   
	   }
	    for(Project p : project_list){
	    	 System.out.println(p);
	    	
	    }
	    	
		
		}
		catch(Exception e){
			e.printStackTrace();
		
	}
		return null;
	}

	@Override
	public boolean deleteProject(Project obj) {
		// TODO Auto-generated method stub
		boolean check = false;
		try{
			
			CallableStatement pstmt = 
				      con.prepareCall("{call deleteProject(?)}");
			pstmt.setInt(1, obj.getProject_Id());
			check = pstmt.execute();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public Collection<Donor> getListOfDonors(int p_id) {
		// TODO Auto-generated method stub
		Collection<Donor> project_details_list = new ArrayList<Donor>();
		try{
			String sqlString = "select * from Donor where Donor_Id In (Select Donor_Id from Donor_Project where Project_Id = ?) ";
			PreparedStatement pstmt = con.prepareStatement(sqlString );
			pstmt.setInt(1, p_id);//obj.getP_ID());
	      ResultSet rs = pstmt.executeQuery();
	     while(rs.next())
	   {
		    project_details_list.add(new Donor(rs.getInt(1),rs.getString(2),rs.getString(3)));
		   
	   }
	    for(Donor d: project_details_list){
	    	 System.out.println(d);
	    	
	    }
	    	
		
		}
		catch(Exception e){
			e.printStackTrace();
		
	}
		
		
		return project_details_list;
	}

	@Override
	public Collection<Project> getProjectDetails(int p_id) {
		// TODO Auto-generated method stub
		Collection<Project> project_details = new ArrayList<Project>();
		try{
			String sqlString = "select * from Project where Project_Id = ?";
			PreparedStatement pstmt = con.prepareStatement(sqlString );
			pstmt.setInt(1, p_id);//obj.getP_ID());
	      ResultSet rs = pstmt.executeQuery();
	     while(rs.next())
	   {
		    project_details.add(new Project(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7)));
		   
	   }
	     
	     
	    for(Project p: project_details){
	    	 System.out.println(p);
	    	
	    }
	    Collection<Donor> donor_list = new ArrayList<Donor>();
	     donor_list = getListOfDonors(p_id);
		
		}
		catch(Exception e){
			e.printStackTrace();
		
	}
		
		
		return null;
		
	}

	

	
}
