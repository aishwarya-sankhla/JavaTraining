import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 005L;
	private long CustomerId;
	private String CustomerName;
	private Address CustomerAdd;
	private transient long CustomerPhone;
	

	
	public Customer(long customerId, String customerName, Address customerAdd, long customerPhone) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerAdd = customerAdd;
		CustomerPhone = customerPhone;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public Address getCustomerAdd() {
		return CustomerAdd;
	}
	public void setCustomerAdd(Address customerAdd) {
		CustomerAdd = customerAdd;
	}
	public long getCustomerPhone() {
		return CustomerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		CustomerPhone = customerPhone;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public Customer(long customerId, String customerName, long customerPhone) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerPhone = customerPhone;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
		if(this.getClass() != obj.getClass())
			return false;
		
		Customer cust = (Customer)obj;
		return this.CustomerId == cust.CustomerId && this.CustomerName.equals(cust.CustomerName);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("One Cutomer Object Garbage Collected="+ this.CustomerId);
		super.finalize();
	}
	
	private void readObject(ObjectInputStream in){
		try {
			in.defaultReadObject();
			this.CustomerPhone = (long)in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return  CustomerId + ","+ CustomerName + "," +CustomerPhone;
	}

	private void writeObject(ObjectOutputStream out) {
		try {
			out.defaultWriteObject();
			out.writeObject(CustomerPhone);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
