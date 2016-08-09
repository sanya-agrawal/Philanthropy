/**
 * 
 */
package com.training.project;

/**
 * @author sagr26
 *
 */
public class Donor {
	private int donorId;
	private String donorName;
	private String donorEmail;
	private double amountDonated;
	
	
	
	/**
	 * @param donorName
	 * @param donorEmail
	 * @param amountDonated
	 */
	public Donor(int donorId,String donorName, String donorEmail, double amountDonated) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.donorEmail = donorEmail;
		this.amountDonated = amountDonated;
	}
	/**
	 * @return the donorName
	 */
	public String getDonorName() {
		return donorName;
	}
	/**
	 * @param donorName the donorName to set
	 */
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	/**
	 * @return the donorEmail
	 */
	public String getDonorEmail() {
		return donorEmail;
	}
	/**
	 * @param donorEmail the donorEmail to set
	 */
	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}
	/**
	 * @return the amountDonated
	 */
	public double getAmountDonated() {
		return amountDonated;
	}
	/**
	 * @param amountDonated the amountDonated to set
	 */
	public void setAmountDonated(double amountDonated) {
		this.amountDonated = amountDonated;
	}
	public int getDonorId() {
		return donorId;
	}
	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}
	

}
