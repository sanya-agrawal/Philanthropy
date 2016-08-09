/**
 * 
 */
package com.training.project;

import java.util.List;

/**
 * @author sagr26
 *
 */
public class Project {
  private int projectId;
  private String projectName;
  private String projectDetails;
  private double projectCost;
  private double projectAmountCollected;
  private List<Donor> donorList;
/**
 * @return the projectCost
 */
public double getProjectCost() {
	return projectCost;
}
/**
 * @param projectCost the projectCost to set
 */
public void setProjectCost(double projectCost) {
	this.projectCost = projectCost;
}
/**
 * @return the projectAmountCollected
 */
public double getProjectAmountCollected() {
	return projectAmountCollected;
}
/**
 * @param projectAmountCollected the projectAmountCollected to set
 */
public void setProjectAmountCollected(double projectAmountCollected) {
	this.projectAmountCollected = projectAmountCollected;
}
/**
 * @return the donorList
 */
public List<Donor> getDonorList() {
	return donorList;
}
/**
 * @param donorList the donorList to set
 */
public void setDonorList(List<Donor> donorList) {
	this.donorList = donorList;
}

/**
 * @return the projectId
 */
public int getProjectId() {
	return projectId;
}
/**
 * @param projectId
 * @param projectName
 * @param projectDetails
 * @param projectCost
 * @param projectAmountCollected
 * @param donorList
 */
public Project(int projectId, String projectName, String projectDetails, double projectCost,
		double projectAmountCollected) {
	super();
	this.projectId = projectId;
	this.projectName = projectName;
	this.projectDetails = projectDetails;
	this.projectCost = projectCost;
	this.projectAmountCollected = projectAmountCollected;
	
}
/**
 * @param projectId the projectId to set
 */
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
/**
 * @return the projectName
 */
public String getProjectName() {
	return projectName;
}
/**
 * @param projectName the projectName to set
 */
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
/**
 * @return the projectDetails
 */
public String getProjectDetails() {
	return projectDetails;
}
/**
 * @param projectDetails the projectDetails to set
 */
public void setProjectDetails(String projectDetails) {
	this.projectDetails = projectDetails;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	// TODO Auto-generated method stub
	StringBuffer buffer = new StringBuffer();
	buffer = buffer.append(projectId).append(".").append(projectName).append(".").append(projectDetails).append(".").append(projectCost).append(".").append(projectAmountCollected);
	return buffer.toString();
}
  
}
