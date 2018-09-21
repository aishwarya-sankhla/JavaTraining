import java.io.*;

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
}
