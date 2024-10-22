import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectHandling {
	
	public boolean saveObject(Object obj){
		boolean status = false;
		ObjectOutputStream outStream = null;
		try {
			
			outStream = new ObjectOutputStream(new FileOutputStream(new File("cutomer.ser")));
			
			outStream.writeObject(obj);
			status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				outStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return status;
	}
	
	public Object loadObject(){
		Object obj = null;
		ObjectInputStream inStream = null;
		try {
			
			inStream = new ObjectInputStream(new FileInputStream(new File("cutomer.ser")));
			
			obj = inStream.readObject();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return obj;
	}
	
	public boolean writeToTextFile(Customer cust){
		boolean result = false;
		
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(new FileWriter(new File("Customer.txt"),true));
			writer.println(cust.toString());
			result = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
		
		return result;
	}
	
	public List<Customer> readFromText(File file){
		List<Customer> custList = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			
			String custAsString;
			while((custAsString = reader.readLine())!=null){
				String[] items = custAsString.split(",");
				Customer cust = new Customer(Long.parseLong(items[0]), items[1], Long.parseLong(items[2]));
				custList.add(cust);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return custList;
	}
}
