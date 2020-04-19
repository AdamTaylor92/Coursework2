package view;
import model.Project;
import model.SortedADT;
import model.SortedADT.NotFoundException;
import model.SortedADT.NotUniqueException;
import model.SortedLinkedList;

public class CompanyTest{

	public static void main(String[] args) throws NotUniqueException {
		
		
		SortedADT Sorted = new SortedLinkedList();
		
		
				int userInput = 0;
	
		
		do {
				showMenu();
				userInput = askForInput();
				evalInput(userInput, Sorted);
				
				
		}
		while (userInput !=10); 
			
	
	}

	private static void evalInput(int userInput, SortedADT sorted) throws NotUniqueException {
		
		switch(userInput)
		{
			case 1:
					addProject(sorted);
					break;
			case 2:
					showProject(sorted);
					break;
			case 3:
					RemoveProject(sorted);
					break;
			case 4:
					showAllProjects(sorted);
					break;
			case 10:
				System.out.println("Are you sure you want to quit if, yes select 20"); 
				userInput = askForInput();
				evalInput(userInput, sorted);
					break;
			case 20:
				System.out.println("Good Bye!");
					break;
			default:
					System.out.println("Please select a correct option");
					break;
			
		
		}
		
	}

	private static void showAllProjects(SortedADT sorted) {
		
			System.out.println(sorted.toString());
						
	}

	private static void RemoveProject(SortedADT sorted) {
		
		try {
			
			String Name = Input.getString("Please enter the project name you wish to find ");
			String startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
			
			Project toBeAdded =  new Project(Name, startDateEndDate);
			sorted.remove(toBeAdded);
			System.out.println(toBeAdded.toString() + "has been removed");

			
		} catch (NotFoundException e) {
			
			System.out.println("That project doesn't exist in the list.");;
		}
		
		
	}

	private static void showProject(SortedADT sorted ) {
		
		
		
		try {
			String Name = Input.getString("Please enter the project name you wish to find ");
			String startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
			
			Project toBeAdded =  new Project(Name, startDateEndDate);
			sorted.find(toBeAdded);
			System.out.println(toBeAdded.toString());

			
		} catch (NotFoundException e) {
			
			System.out.println("That project doesn't exist in the list.");;
		}
		
		
		
		
	}

	private static void addProject(SortedADT sorted) throws NotUniqueException {
		
		
		String Name = Input.getString("Please enter the project name ");

		String startDateEndDate = Input.getString("PLease enter the Start and end date in the format DD/MM/YY - DD/MM/YY ");
		
	    Project toBeAdded =  new Project (Name,startDateEndDate); // creates the project object to add 
		
		try {
		 sorted.insert(toBeAdded); //adds the object
		}
		catch (SortedADT.NotUniqueException e)
		{
			System.out.println("That project already exists. Please enter a different project.");
		}
	}

	private static Integer askForInput() throws NumberFormatException {
		try
			{
				return Input.getInteger("Please select an option");
			}
		catch(NumberFormatException e)
			{
			System.out.println("Invalid Selection - Please try again");
			return 0;
			}
		
			
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
