package view;


public class CompanyTest {

	public static void main(String[] args) {
		
		int userInput = 0;
	
		
		do {
				showMenu();
				userInput = askForInput();
				evalInput(userInput);
				
				
		}
		while (userInput !=10);
			
	
	}

	private static void evalInput(int userInput) {
		
		switch(userInput)
		{
			case 1:
					addProject();
					break;
			case 2:
					showProject();
					break;
			case 3:
					sortProject();
					break;
			case 4:
					showAllProjects();
					break;
			case 10:
				System.out.println("Are you sure you want to quit if, yes select 20");
				userInput = askForInput();
				evalInput(userInput);
					break;
			case 20:
					break;
			default:
					System.out.println("Please select a correct option");
					break;
			
		
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
		System.out.println(" 4: Show All Projects");
		System.out.println("10: Exit ProjectList");
		
	}

}
