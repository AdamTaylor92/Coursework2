package view;

import model.ProjectList;
import model.Project;

public class CompanyTest{

	public static void main(String[] args) {
		
		ProjectList List = new ProjectList();
		
				int userInput = 0;
	
		
		do {
				showMenu();
				userInput = askForInput();
				evalInput(userInput, List);
				
				
		}
		while (userInput !=10); 
			
	
	}

	private static void evalInput(int userInput, ProjectList List) {
		
		switch(userInput)
		{
			case 1:
					addProject(List);
					break;
			case 2:
					showProject(List);
					break;
			case 3:
					RemoveProject(List);
					break;
			case 4:
					showAllProjects(List);
					break;
			case 10:
				System.out.println("Are you sure you want to quit if, yes select 20"); 
				userInput = askForInput();
				evalInput(userInput, List);
					break;
			case 20:
				System.out.println("Good Bye!");
					break;
			default:
					System.out.println("Please select a correct option");
					break;
			
		
		}
		
	}

	private static void showAllProjects(ProjectList List) {
			System.out.println("This is all current Projects");
			System.out.println(List.getProjectList().toString());
	}

	private static void RemoveProject(ProjectList List) {
		
		String Name = Input.getString("Please Enter the Name of the project you would like to delete");
		String sDateEDate = Input.getString("Please enter the Start and end dates of the project in the format DD/MM/YY - DD/MM/YY ");
		
		Project toBeRemoved = new Project (Name, sDateEDate);
		List.RemoveProject(toBeRemoved);
		
	}

	private static void showProject(ProjectList List) {
		// TODO Auto-generated method stub
		
	}

	private static void addProject(ProjectList List) {
		
		String Name = Input.getString("Please enter the project name ");
		String startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
		
		Project toBeAdded = new Project (Name,startDateEndDate); // creates the project object to add 
		List.AddProject(toBeAdded);
		
		
	}

	private static int askForInput() {
		
		return Input.getInteger("Please select an option");
	}

	private static void showMenu() {
		
		System.out.println("Welcome to the Project List. Please choose an option");
		System.out.println(" 1: Add a project");
		System.out.println(" 2: Find And Show a project");
		System.out.println(" 3: Remove a project");
		System.out.println(" 4: Show All Projects");
		System.out.println("10: Exit ProjectList");
		
	}

}
