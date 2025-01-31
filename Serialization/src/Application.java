import java.io.File;
import java.util.List;
import java.util.logging.Handler;

public class Application {
	public static void main (String[] args) {
		Address add1 = new Address("Gandhi nagar", "Street 1", 561021);
		Customer c2 = new Customer(102, "Sam", 9980577);
		
		ObjectHandling handle = new ObjectHandling();
		boolean result = handle.saveObject(c2);
		
		if(result == true)
			System.out.println("Serialization done");
		else
			System.out.println("Serialization not done");
		
		Customer obj = (Customer)handle.loadObject();
		System.out.println(obj.getCustomerName());
		System.out.println(obj.getCustomerPhone());
		
		boolean status = handle.writeToTextFile(c2);
		
		if(status){
			System.out.println("Text File Created");
		}
		else
			System.out.println("Error see log file");
		
		List<Customer> custList = handle.readFromText(new File("Customer.txt"));
		custList.forEach(System.out::println);
		}
	
	
	}

