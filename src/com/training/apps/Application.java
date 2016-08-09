package com.training.apps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.impl.DonorImpl;
import com.training.impl.ProjectImpl;
import com.training.domains.Authentication;
//import com.training.project.ProjectImpl;
import com.training.entity.Donor;
import com.training.entity.Project;

public class Application {

	public static void ApplicationStart(){
		
		DonorImpl Donor = new DonorImpl();
		Donor donor1 = new Donor();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str_name,str_email;
		System.out.println("Welcome");
		System.out.println("Authentication required");
		System.out.println("Enter your name and e-mail id:");
		Scanner sc = new Scanner(System.in);
	    str_name = sc.next();
	    str_email = sc.next();
		if(Authentication.authenticateDonor(str_name, str_email)){
			System.out.println("Authenticated User");
			ApplicationStart();
		}
		
		
		
		
		
		
		
		
		
		
	//	ProjectImpl Project = new ProjectImpl();
	//	DonorImpl Donor = new DonorImpl();
	//	Donor.deleteDonor(2);
		
		
	//	System.out.println("Choose a project and enter the amount to be donated");
		
	//	Project pjr1 = new Project(4,	"Skin Cancer",	"Cure to skin cancer",	"CAN",	6000,	3000,	3000);		
		
	//	Project.getProjectDetails(6);
	//	Project.deleteProject(pjr1);
		
	//	Project.list_all_projects();
    //    Project.getListOfDonors(6);
	
		
		
	//	int i = 0;
	/*	Switch(i)
		{
			case 1:
		}*/
		
		
		//	Project pjr1 = new Project(7,"Senior S Secondary Education","Education S","PRI",5000,2000,3000);
	//	Project.addProject(pjr1);
		
	//	DonorImpl Donor = new DonorImpl();
	//	Donor dnr1 = new Donor(7,"Raj","rajk@abc.com");
	//	Donor.addDonor(dnr1);
   /*     ProjectImpl Project = new ProjectImpl();
		Project project1 = new Project(101,"A","B",1000,2000);
        Project project2 = new Project(102,"C","D",3000,4000);
        Project project3 = new Project(103,"E","F",5000,6000);
        Project.addProjects(project1,project2,project3);
        Project.printProjectList();*/
        
  /*      System.out.println("Project List");
        Project.printProjectList();
        int i = 1;
        switch(i)
        {
        	case 1: project1.setDonorList(donorList);
        	default : 
        }
        */
		System.exit(0);
	}

	

}
