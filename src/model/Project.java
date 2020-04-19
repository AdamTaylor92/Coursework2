package model;

 

public class Project implements Comparable{

	
	
	private String projectTitle;
	private String StartDateEndDate;
	private SortedADT MemberTree;
	
	
	public Project() {
		this.projectTitle = "";
		this.StartDateEndDate = "";
		this.MemberTree = new BinarySearchTree();
		
		
		
	}
	
public Project(String projectTitle, String StartDateEndDate, SortedADT MemberTree )
{

	this.projectTitle = projectTitle;
	this.StartDateEndDate = StartDateEndDate;
	this.MemberTree = MemberTree;
	
	
	
}

public SortedADT getMemberTree() {
	return MemberTree;
}

public void setMemberTree(SortedADT memberTree) {
	MemberTree = memberTree;
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
	Project Aux = (Project) o; 
	
	
	int answer = this.projectTitle.compareToIgnoreCase(Aux.getProjectTitle());
	
	return answer;
}


	
}
