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
public interface IDonor {
	public boolean addDonor(Donor obj);
//	public void authenticateDonor(String name,String email);
//	public boolean[] addDonors(Donor... dnrList);
//	public void printDonorList();
	public Collection<Donor> getDonorList();
	public Project getProject();
	public List<Project> getProjects();
    public boolean deleteDonor(int d_id);
    public int donateToProject(int p_id,int d_id,int amount);
}
