package model;

import java.util.LinkedList;

public class Company {
		
	private LinkedList projectList;

	public LinkedList getProjectList() {
		return projectList;
	}

	public void setProjectList(LinkedList projectList) {
		this.projectList = projectList;
	}
	
	public void AddProject (Project P) { //takes the Project object passed to it and adds it to the list.
		
		this.projectList.add(P);
		
	}
	
}
