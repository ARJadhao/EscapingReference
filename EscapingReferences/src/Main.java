import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
				
		for (CustomerInterface next : records.getCustomers().values())
				{
					System.out.println(next);
				}

		System.out.println("Using keySet");
		Set<String> keys = records.getCustomers().keySet();
		for (String iter : keys) {
			System.out.println(records.getCustomerByName(iter));
			
		}
		System.out.println("Using Iter");
		for (Customer iter : records.getCustomers().values()) {
			System.out.println(iter);
		}
		
		System.out.println("Using copy constructor");
		//Using Copy Constructor access, to avoid escaping reference
		CustomerInterface copyObject = new Customer(records.getCustomers().get("John"));
		System.out.println(copyObject.getName());
		
		for (String string : keys) {
			
		}
		
		
		//System.out.println(records.getCustomers());
	}
	
	
}
