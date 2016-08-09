/**
 * 
 */
package com.training.project;

import java.util.ArrayList;
import java.util.HashMap;

import com.training.ifaces.IProject_Donor;
import com.training.utils.Donor;
import com.training.utils.Project;

/**
 * @author sagr26
 *
 */
public class IProject_DonorImpl implements IProject_Donor {
    private HashMap<Donor,Project> project_donorMap;
	/**
	 * @param project_donorMap
	 */
	public IProject_DonorImpl(HashMap<Donor, Project> project_donorMap) {
		super();
		this.setProject_donorMap(project_donorMap);
	}
	public IProject_DonorImpl(){
		super();
		setProject_donorMap(new HashMap<Donor, Project>());
	}
	/* (non-Javadoc)
	 * @see com.training.ifaces.IProject_Donor#addProject_Donor(com.training.project.Donor, com.training.project.Project)
	 */
	@Override
	public boolean addProject_Donor(Donor dnr, Project prj) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(project_donorMap.put(dnr,prj)!=null)
			result = true;
		
		return result;
	}
	 
	@Override
	public Project getProject_Donor(Donor dnr) {
		// TODO Auto-generated method stub
		
		return project_donorMap.get(dnr);
	}
	/**
	 * @return the project_donorMap
	 */
	public HashMap<Donor, Project> getProject_donorMap() {
		return project_donorMap;
	}
	/**
	 * @param project_donorMap the project_donorMap to set
	 */
	public void setProject_donorMap(HashMap<Donor, Project> project_donorMap) {
		this.project_donorMap = project_donorMap;
	}
	

}
