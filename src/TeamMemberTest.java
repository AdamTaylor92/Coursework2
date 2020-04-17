

import model.SortedADT;
import model.SortedADT.NotFoundException;
import model.SortedADT.NotUniqueException;
import view.Input;

public class TeamMemberTest {

	public static void main(String[] args) throws NotUniqueException {

		SortedADT TMember = new BinarySearchTree();
		

		int userInput = 0;


do {
		showMenu();
		userInput = askForInput();
		evalInput(userInput, TMember);
		
		
}
while (userInput !=10); 
	
		
	


	}
	
private static void evalInput(int userInput, SortedADT TMember) throws NotUniqueException {
		
		switch(userInput)
		{
			case 1:
					addMember(TMember);
					break;
			case 2:
					showMember(TMember);
					break;
			case 3:
					RemoveMember(TMember);
					break;
			case 4:
					showAllMembers(TMember);
					break;
			case 10:
				System.out.println("Are you sure you want to quit if, yes select 20"); 
				userInput = askForInput();
				evalInput(userInput, TMember);
					break;
			case 20:
				System.out.println("Good Bye!");
					break;
			default:
					System.out.println("Please select a correct option");
					break;
			
		
		}
		
	}	



private static void addMember(SortedADT TMember) {
	
	
	try {
		String Name = Input.getString("Please enter the Team Member name");
		String Department = Input.getString("PLease enter the department ");
		int EID = Input.getInteger("Please Enter the employee ID");
		
		
		TeamMember toBeAdded =  new TeamMember(Name, EID, Department);
		TMember.insert(toBeAdded);
		System.out.println(toBeAdded.toString()+ "\n has been sucsefully been addded");

		
	} catch (NotUniqueException e) {
		
		System.out.println("That Team Member is already on the tree.");;
	}
	
}

private static void showMember(SortedADT TMember) {

	try {
		String Name = Input.getString("Please enter the Team Member name");
		String Department = Input.getString("PLease enter the department ");
		int EID = Input.getInteger("Please Enter the employee ID");
		
		TeamMember toBeFound =  new TeamMember(Name, EID, Department);
		TMember.find(toBeFound);
		System.out.println(toBeFound.toString()+ "\nhas been found");

		
	} catch (NotFoundException e) {
		
		System.out.println("That Team Member doesn't exist in the tree.");;
	}
	
	
}

private static void RemoveMember(SortedADT TMember) {
	try {
		
		String Name = Input.getString("Please enter the Team Member name");
		String Department = Input.getString("PLease enter the department ");
		int EID = Input.getInteger("Please Enter the employee ID");
		
		
		TeamMember toBeRemoved =  new TeamMember(Name, EID, Department);
		TMember.remove(toBeRemoved);
		System.out.println(toBeRemoved.toString() + " \nhas been removed");

		
	} catch (NotFoundException e) {
		
		System.out.println("That project doesn't exist in the list.");;
	}
	
	
}

private static void showAllMembers(SortedADT TMember) {
	System.out.println(TMember.toString());
	
}

private static int askForInput() {
	
	return Input.getInteger("Please select an option");
}

private static void showMenu() {
	
	System.out.println("Welcome to the Project List. Please choose an option");
	System.out.println(" 1: Add a Team Member");
	System.out.println(" 2: Find And Show a Team Member");
	System.out.println(" 3: Remove a Team Member");
	System.out.println(" 4: Show All Team Members");
	System.out.println("10: Exit ");
	
}


}
