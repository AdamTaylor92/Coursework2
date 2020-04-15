package model;

import java.util.LinkedList;

//Class to deal with the list of projects

public class ProjectList {
		
	private LinkedList projectList = new LinkedList();

	public ProjectList() {
		
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
	
	
}
