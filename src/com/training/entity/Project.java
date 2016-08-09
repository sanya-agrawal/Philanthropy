package com.training.entity;

import java.util.Collection;
import java.util.List;

public class Project {
	private int Project_Id;
	private String Project_Name;
	private String Project_Desc;
	private String Project_Type;
	private int Project_Cost;
	private int Project_Pending_Amt;
	private int Amount_Collected;
	private Collection<Donor> list_of_donors;
	/**
	 * @param project_Id
	 * @param project_Name
	 * @param project_Desc
	 * @param project_Type
	 * @param project_Cost
	 * @param project_Pending_Amt
	 * @param amount_Collected
	 */
	public Project(int project_Id, String project_Name, String project_Desc, String project_Type, int project_Cost,
			int project_Pending_Amt, int amount_Collected) {
		super();
		Project_Id = project_Id;
		Project_Name = project_Name;
		Project_Desc = project_Desc;
		Project_Type = project_Type;
		Project_Cost = project_Cost;
		Project_Pending_Amt = project_Pending_Amt;
		Amount_Collected = amount_Collected;
	}
	
	/**
	 * @return the project_Id
	 */
	public int getProject_Id() {
		return Project_Id;
	}
	/**
	 * @param project_Id the project_Id to set
	 */
	public void setProject_Id(int project_Id) {
		Project_Id = project_Id;
	}
	/**
	 * @return the project_Name
	 */
	public String getProject_Name() {
		return Project_Name;
	}
	/**
	 * @param project_Name the project_Name to set
	 */
	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}
	/**
	 * @return the project_Desc
	 */
	public String getProject_Desc() {
		return Project_Desc;
	}
	/**
	 * @param project_Desc the project_Desc to set
	 */
	public void setProject_Desc(String project_Desc) {
		Project_Desc = project_Desc;
	}
	/**
	 * @return the project_Type
	 */
	public String getProject_Type() {
		return Project_Type;
	}
	/**
	 * @param project_Type the project_Type to set
	 */
	public void setProject_Type(String project_Type) {
		Project_Type = project_Type;
	}
	/**
	 * @return the project_Cost
	 */
	public int getProject_Cost() {
		return Project_Cost;
	}
	/**
	 * @param project_Cost the project_Cost to set
	 */
	public void setProject_Cost(int project_Cost) {
		Project_Cost = project_Cost;
	}
	/**
	 * @return the project_Pending_Amt
	 */
	public int getProject_Pending_Amt() {
		return Project_Pending_Amt;
	}
	/**
	 * @param project_Pending_Amt the project_Pending_Amt to set
	 */
	public void setProject_Pending_Amt(int project_Pending_Amt) {
		Project_Pending_Amt = project_Pending_Amt;
	}
	/**
	 * @return the amount_Collected
	 */
	public int getAmount_Collected() {
		return Amount_Collected;
	}
	/**
	 * @param amount_Collected the amount_Collected to set
	 */
	public void setAmount_Collected(int amount_Collected) {
		Amount_Collected = amount_Collected;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer = buffer.append(Project_Id).append(".").append(Project_Name).append(".").append(Project_Desc).append(".").append(Project_Type).append(".").append(Project_Cost).append(".").append(Project_Pending_Amt).append(".").append(Amount_Collected);
		return buffer.toString();
		
	}

	public Collection<Donor> getList_of_donors() {
		return list_of_donors;
	}

	public void setList_of_donors(Collection<Donor> list_of_donors) {
		this.list_of_donors = list_of_donors;
	}

	
	

}
