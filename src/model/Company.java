package model;

import java.util.LinkedList;

//Class to deal with the list of projects

public class Company {
		
	private LinkedList projectList = new LinkedList();

	public Company() {
		
		}

	public LinkedList getProjectList() {
		return projectList;
	}

	public void setProjectList(LinkedList projectList) {
		this.projectList = projectList;
	}
	
	public void AddProject (Project P) { //takes the Project object passed to it and adds it to the list.
		
	
		this.projectList.addFirst(P);
		
	}
	
	public void RemoveProject (Project P) {
		this.projectList.remove(P);
	}
	
	
}
