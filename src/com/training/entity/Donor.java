/**
 * 
 */
package com.training.entity;

import java.util.Collection;
import java.util.List;

/**
 * @author sagr26
 *
 */
public class Donor {
	private int Donor_Id;
	private String Donor_Name;
	private String Donor_Email;
	private int Amount_Donated;
	private int P_ID;
	private Collection<Project> list_of_projects;
	/**
	 * @param donor_Id
	 * @param donor_Name
	 * @param donor_Email
	 * @param amount_Donated
	 * @param list_of_projects
	 */
	public Donor(int donor_Id, String donor_Name, String donor_Email){//, int amount_Donated,
		//	List<Project> list_of_projects) {
		super();
		Donor_Id = donor_Id;
		Donor_Name = donor_Name;
		Donor_Email = donor_Email;
	//	Amount_Donated = amount_Donated;
	//	this.list_of_projects = list_of_projects;
	}
	/**
	 * @return the donor_Id
	 */
	public int getDonor_Id() {
		return Donor_Id;
	}
	/**
	 * @param donor_Id the donor_Id to set
	 */
	public void setDonor_Id(int donor_Id) {
		Donor_Id = donor_Id;
	}
	/**
	 * @return the donor_Name
	 */
	public String getDonor_Name() {
		return Donor_Name;
	}
	/**
	 * @param donor_Name the donor_Name to set
	 */
	public void setDonor_Name(String donor_Name) {
		Donor_Name = donor_Name;
	}
	/**
	 * @return the donor_Email
	 */
	public String getDonor_Email() {
		return Donor_Email;
	}
	/**
	 * @param donor_Email the donor_Email to set
	 */
	public void setDonor_Email(String donor_Email) {
		Donor_Email = donor_Email;
	}
	/**
	 * @return the amount_Donated
	 */
/*	public int getAmount_Donated() {
		return Amount_Donated;
	}
	/**
	 * @param amount_Donated the amount_Donated to set
	 */
/*	public void setAmount_Donated(int amount_Donated) {
		Amount_Donated = amount_Donated;
	}
	*/
	public int getAmount_Donated() {
		return Amount_Donated;
	}
	public void setAmount_Donated(int amount_Donated) {
		Amount_Donated = amount_Donated;
	}
	public int getP_ID() {
		return P_ID;
	}
	public void setP_ID(int p_ID) {
		P_ID = p_ID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer = buffer.append(Donor_Id).append(".").append(Donor_Name).append(".").append(Donor_Email);
		return buffer.toString();
	}
	
	
	

}
