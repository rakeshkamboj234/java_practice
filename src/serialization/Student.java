package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	transient Address address;
	
	public void setAddress(Address address){
		this.address = address;
	}
	public Address getAddress(){
		return address;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	private void writeObject(ObjectOutputStream os)throws IOException, ClassNotFoundException {
		try {
			os.defaultWriteObject();
			os.writeObject(address.getCity());
		} catch(Exception e) {
			
		}
	}
	private void readObject(ObjectInputStream is)throws IOException, ClassNotFoundException {
		try {
			is.defaultReadObject();
			String city=(String) is.readObject();
			address=new Address(city);
		} catch(Exception e) {
			
		}
	}
}