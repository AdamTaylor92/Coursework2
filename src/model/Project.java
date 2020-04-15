package model;



public class Project implements Comparable{

	
	
	private String projectTitle;
	private String StartDateEndDate;
	
	
	public Project() {
		this.projectTitle = "";
		this.StartDateEndDate = "";
	}
	
public Project(String projectTitle, String StartDateEndDate)
{

	this.projectTitle = projectTitle;
	this.StartDateEndDate = StartDateEndDate;
	
	
}

public String getProjectTitle() {
	return projectTitle;
}

public void setProjectTitle(String projectTitle) {
	this.projectTitle = projectTitle;
}

public String getStartDateEndDate() {
	return StartDateEndDate;
}

public void setStartDateEndDate(String startDateEndDate) {
	StartDateEndDate = startDateEndDate;
}

@Override
public String toString() {
	return  projectTitle + " " + StartDateEndDate;
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
	
}
