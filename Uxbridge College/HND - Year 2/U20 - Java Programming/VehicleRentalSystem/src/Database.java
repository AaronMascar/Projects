import java.util.ArrayList;

public class Database {
	
	private ArrayList<Customer> customers;
	
	public Database() {
		customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void printCustomers() {
		
		System.out.println("Customers: ");
		int i = 0;
		for (Customer customer : customers) {
			System.out.println("Customer #" + (i + 1) + ":");
			System.out.println(customer);
			i++;
		}
	}

}
