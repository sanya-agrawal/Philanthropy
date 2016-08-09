/**
 * 
 */
package com.training.ifaces;

import java.util.HashMap;

import com.training.entity.Donor;
import com.training.entity.Project;

/**
 * @author sagr26
 *
 */
public interface IProject_Donor {
	public boolean addProject_Donor(Donor dnr,Project prj);
	public Project getProject_Donor(Donor dnr);

}
