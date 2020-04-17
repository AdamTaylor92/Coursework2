import model.Project;

public class TeamMember implements Comparable{

	private String Name;
	private int EID;
	private String Department;
	
	
	public TeamMember() {
		this.Name = "";
		this.EID = 0;
		this.Department = "";
		
	}
		
	public TeamMember(String Name, int EID, String Department)
	{
		this.Name = Name;
		this.EID = EID;
		this.Department = Department;
	}
	
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getEID() {
		return EID;
	}

	public void setEID(int eID) {
		EID = eID;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	
	@Override
	public int compareTo(Object o) {
		TeamMember Aux = (TeamMember) o; 
		
		
		int answer = this.Name.compareToIgnoreCase(Aux.getName());
		
		return answer;
	}

	@Override
	public String toString() {
		return "TeamMember Name=" + Name + ", EID=" + EID + ", Department=" + Department;
	}

}
