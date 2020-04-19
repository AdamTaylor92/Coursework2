

import model.Project;
import model.SortedADT;
import model.SortedADT.NotFoundException;
import model.SortedADT.NotUniqueException;
import view.Input;

public class TeamMemberTest {

	
	public static void main(String[] args) throws NotUniqueException {

		//tree for the projects
		SortedADT Project = new BinarySearchTree();
		
		
		int userInput = 0;

do {
		showMenu();
		userInput = askForInput();
		evalInput(userInput,Project);
	
}
while (userInput !=10); 
	

	}
	
private static void evalInput(int userInput, SortedADT Project) throws NotUniqueException {
		
		switch(userInput)
		{
		
			case 1:
					addProject(Project);
					break;
			case 2:
					showProject(Project);
					break;
			case 3:
					RemoveProject(Project);
					break;
			case 4:
					showAllProjects(Project);
					break;
			case 5:
					addMember(Project);
					break;
			case 6:
					showMember(Project);
					break;
			case 7:
					RemoveMember(Project);
					break;
			case 8:
					showAllMembers(Project);
					break;
			case 10:
				System.out.println("Are you sure you want to quit if, yes select 20"); 
				userInput = askForInput();
				evalInput(userInput, Project);
					break;
			case 20:
				System.out.println("Good Bye!");
					break;
			default:
					System.out.println("Please select a correct option");
					break;
			
		
		}
		
	}	



private static void showAllProjects(SortedADT project) {
	System.out.println(project.toString()) ;
	
}

private static void RemoveProject(SortedADT project) {
	try {
		
		String Name = Input.getString("Please enter the project name you wish to find ");
		String startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
		
		Project toBeRemoved =  new Project(Name, startDateEndDate);
		project.remove(toBeRemoved);
		System.out.println(toBeRemoved.toString() + "has been removed");

		
	} catch (NotFoundException e) {
		
		System.out.println("That project doesn't exist in the list.");;
	}
	
}

private static void showProject(SortedADT project) {

	
	try {
		String Name = Input.getString("Please enter the project name you wish to find ");
		String startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
		
		Project toBeFound =  new Project(Name, startDateEndDate);
		project.find(toBeFound);
		System.out.println(toBeFound.toString());
		
		
	} catch (NotFoundException e) {
		
		System.out.println("That project doesn't exist in the list.");;
	}
}

private static void addProject(SortedADT project) {

	
	try {
		String Name = Input.getString("Please enter the Project name");
		String startDateEndDate = Input.getString("PLease enter the Start and end dates in this format DD/MM/YY - DD/MM/YY ");
		
		
		
		Project toBeAdded =  new Project(Name,startDateEndDate);
		project.insert(toBeAdded);
		System.out.println(toBeAdded.toString()+ " has been sucsefully been addded");
	

		
	} catch (NotUniqueException e) {
		
		System.out.println("That project is already on the tree.");;
	}
	
}



private static void addMember(SortedADT project) { 
	
	
	String Name = ""; 
	String startDateEndDate ="";
	Project toBeFound =  new Project(Name, startDateEndDate);
	
	
	try {
		System.out.println("\nFirst please enter the project you wish to add a member to");
		Name = Input.getString("Please enter the project name you wish to find ");
		startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
		toBeFound =  new Project(Name, startDateEndDate);
		project.find(toBeFound);
		SortedADT MemberTree = toBeFound.getMemberTree();
				
			try {
		
					String MName = Input.getString("Please enter the Team Member name");
					String Department = Input.getString("PLease enter the department ");
					int EID = Input.getInteger("Please Enter the employee ID");
		
					TeamMember toBeAdded =  new TeamMember(MName, EID, Department); //Member object to be added to the subtree for the project.
					MemberTree.insert(toBeAdded);
					toBeFound.setMemberTree(MemberTree);
					System.out.println(toBeAdded.toString()+ "\n has been sucsefully been addded to project " + toBeFound.toString());

		
				} catch (NotUniqueException e) {
		
						System.out.println("That Team Member is already on the tree.\n");
	}
		
	
} catch (NotFoundException e) {
		
		System.out.println("That project doesn't exist in the list.\n");
	}
	
} 

private static void showMember(SortedADT project) {

	String Name = ""; 
	String startDateEndDate ="";
	
	Project toBeFound =  new Project(Name, startDateEndDate);
	
	
	try {
		
		System.out.println("\nFirst please enter the project you wish to add a member to");
		Name = Input.getString("Please enter the project name you wish to find ");
		startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
		toBeFound =  new Project(Name, startDateEndDate);
		project.find(toBeFound);
		SortedADT MemberTree = toBeFound.getMemberTree();
				
			try {
		
					String MName = Input.getString("Please enter the Team Member name");
					String Department = Input.getString("PLease enter the department ");
					int EID = Input.getInteger("Please Enter the employee ID");
		
					TeamMember MtoBeFound =  new TeamMember(MName, EID, Department); //Member object to be added to the subtree for the project.
					MemberTree.find(MtoBeFound);
					System.out.println(MtoBeFound.toString()+ "\n has been sucsefully been found in " + toBeFound.toString());

		
				} catch (NotFoundException e) {
		
						System.out.println("That Team Member is not found.\n");
	}
		
	
} catch (NotFoundException e) {
		
		System.out.println("That project doesn't exist in the list.\n");
	}
}

private static void RemoveMember(SortedADT project){
	String Name = ""; 
	String startDateEndDate ="";
	Project toBeFound =  new Project(Name, startDateEndDate);
	
	
	try {
		System.out.println("\nFirst please enter the project you wish to add a member to");
		Name = Input.getString("Please enter the project name you wish to find ");
		startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
		toBeFound =  new Project(Name, startDateEndDate);
		project.find(toBeFound);
		SortedADT MemberTree = toBeFound.getMemberTree();
				
			try {
		
					String MName = Input.getString("Please enter the Team Member name");
					String Department = Input.getString("PLease enter the department ");
					int EID = Input.getInteger("Please Enter the employee ID");
		
					TeamMember MtoBeRemoved =  new TeamMember(MName, EID, Department); //Member object to be added to the subtree for the project.
					MemberTree.remove(MtoBeRemoved);
					System.out.println(MtoBeRemoved.toString()+ "\n has been sucsefully been removed from the  project " + toBeFound.toString());

		
				} catch (NotFoundException e) {
		
						System.out.println("That Team Member is not on the tree.\n");
	}
		
	
	} catch (NotFoundException e) {
		
		System.out.println("That project doesn't exist in the list.\n");
	}
		

}
	
private static void showAllMembers(SortedADT project) {

	String Name = ""; 
	String startDateEndDate ="";
	Project toBeFound =  new Project(Name, startDateEndDate);
	
	
	try {
		
		System.out.println("\nFirst please enter the project you wish to add a member to");
		Name = Input.getString("Please enter the project name you wish to find ");
		startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
		toBeFound =  new Project(Name, startDateEndDate);
		project.find(toBeFound);
		SortedADT MemberTree = toBeFound.getMemberTree();
		
				
		System.out.println(MemberTree.toString());
		
				
	
} catch (NotFoundException e) {
		
		System.out.println("That project doesn't exist in the list.\n");
	}

}

private static int askForInput() {
	
	return Input.getInteger("Please select an option");
}


private static void showMenu() {
	
System.out.println("Welcome to the Project List. Please choose an option");
System.out.println(" 1: Add a project");
System.out.println(" 2: Find And Show a project");
System.out.println(" 3: Remove a project");
System.out.println(" 4: Show All info");
System.out.println(" 5: Add a Team Member");
System.out.println(" 6: Find And Show a Team Member");
System.out.println(" 7: Remove a Team Member");
System.out.println(" 8: Show All Team Members");
System.out.println("10: Exit ");
}
}
