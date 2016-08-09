/**
 * 
 */
package com.training.ifaces;

import java.util.Collection;
import java.util.List;

import com.training.entity.Donor;
import com.training.entity.Project;

/**
 * @author sagr26
 *
 */
public interface iProject {
	public boolean addProject(Project obj);
	public Collection<Project> list_all_projects();
	public boolean deleteProject(Project obj);
	public Collection<Donor> getListOfDonors(int p_id);
	public Collection<Project> getProjectDetails(int p_id);
	

}
