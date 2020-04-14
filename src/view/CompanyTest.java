package view;


import model.Project;
import model.Company;

public class CompanyTest{

	public static void main(String[] args) {
		
		Company List = new Company();
		
				int userInput = 0;
	
		
		do {
				showMenu();
				userInput = askForInput();
				evalInput(userInput, List);
				
				
		}
		while (userInput !=10); // Check this with the menu - Might need to change to 20
			
	
	}

	private static void evalInput(int userInput, Company List) {
		
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
				System.out.println("Are you sure you want to quit if, yes select 20"); //Check this later so you know if it works
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

	private static void showAllProjects(Company List) {
			System.out.println("This is all current Projects" + List.toString() );
		
	}

	private static void RemoveProject(Company List) {
		// TODO Auto-generated method stub
		
	}

	private static void showProject(Company List) {
		// TODO Auto-generated method stub
		
	}

	private static void addProject(Company List) {
		
		
		
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
