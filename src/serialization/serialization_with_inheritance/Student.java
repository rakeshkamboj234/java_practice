package serialization.serialization_with_inheritance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student extends Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	Address address;
	
	public Student(){ System.out.println("student no args");	}
	
	public Student(String name,Address address){
		super(address.getCity());
		this.name = name;
		this.address = address;
	}
	
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
}