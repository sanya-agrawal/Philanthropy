/**
 * 
 */
package com.training.project;

import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.iProject;
import com.training.utils.Project;

/**
 * @author sagr26
 *
 */
public class ProjectImpl implements iProject {
    private List<Project> projectList;
	/* (non-Javadoc)
	 * @see com.training.ifaces.iProject#addProject(com.training.project.Project)
	 */
    
	@Override
	public boolean addProject(Project obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		result = projectList.add(obj);
		return result;
	}

	/**
	 * @param projectList
	 */
	public ProjectImpl(List<Project> projectList) {
		super();
		this.projectList = projectList;
	}

	public ProjectImpl(){
		super();
		projectList = new ArrayList<>();
	}
	/* (non-Javadoc)
	 * @see com.training.ifaces.iProject#addProjects(com.training.project.Donor[])
	 */
	@Override
	public boolean[] addProjects(Project... prjList) {
		// TODO Auto-generated method stub
		int size = prjList.length;
		boolean result[] = new boolean[size];
		int i = 0;
		
		for(Project prj : prjList)
		{
			result[i] = projectList.add(prj);
			i++;
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.training.ifaces.iProject#printProjectList()
	 */
	@Override
	public void printProjectList() {
		// TODO Auto-generated method stub
		for(Project prj : projectList)
        {	
		  System.out.println(prj);
        }
	}

	/* (non-Javadoc)
	 * @see com.training.ifaces.iProject#getProjectList()
	 */
	@Override
	public List<Project> getProjectList() {
		// TODO Auto-generated method stub
		return projectList;
	}

	
	}


