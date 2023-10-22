import java.util.Scanner;

public class UserInterface {

	private Database database;

	public UserInterface() {
		this.database = new Database();
	}
	
	public void run() {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("> Select an option:");
			System.out.println(" 1. add a customer.");
			System.out.println(" 2. print customers.");
			System.out.println(" 0. exit");
			System.out.print("> ");	
			choice = scanner.nextInt();
			
			// flushing out '\n'
			if (scanner.hasNextLine()) {
				scanner.nextLine();
			}
			if (choice == 1) {
				Customer customer = new Customer();
				
				System.out.print("> Enter customer name:");
				customer.setName(scanner.nextLine());
				
				System.out.print("> Enter customer id:");
				customer.setId(scanner.nextLine());
				
				database.addCustomer(customer);
				
			}
			
			else if (choice == 2) {
				database.printCustomers();
			}
			
			else if (choice == 0) { 
				System.out.println("Goodbye!");
			}			
			else {
				System.out.println("> Please enter valid choice");
			}
			
		} while (choice != 0);
		
		scanner.close();
	}
	
}
