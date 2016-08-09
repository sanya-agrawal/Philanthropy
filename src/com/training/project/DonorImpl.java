package com.training.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.ifaces.IDonor;
import com.training.entity.Donor;
import com.training.entity.Project;

public class DonorImpl implements IDonor {
	private List<Donor> donorList;


	public DonorImpl(List<Donor> donorList) {
		super();
		this.donorList = donorList;
	}
	
	public DonorImpl(){
		super();
		donorList = new ArrayList<>();
	}

	@Override
	public boolean addDonor(Donor obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		result = donorList.add(obj);
		return result;
	}

	@Override
	public boolean[] addDonors(Donor... dnrList) {
		// TODO Auto-generated method stub
		int size = dnrList.length;
		boolean result[] = new boolean[size];
		int i = 0;
		
		for(Donor donor : dnrList)
		{
			result[i] = donorList.add(donor);
			i++;
		}
		return result;
	}

	@Override
	public void printDonorList() {
		// TODO Auto-generated method stub
        for(Donor donor : donorList)
        {	
		  System.out.println(donor);
        }
	}

	@Override
	public List<Donor> getDonorList() {
		// TODO Auto-generated method stub
		return donorList;
	}
	public void printByOrder(Comparator comparator)
	{
		Collections.sort(donorList,comparator);
		printDonorList();
	}

	@Override
	public Project getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjects() {
		// TODO Auto-generated method stub
		return null;
	}

}
