package serialization.serialization_with_inheritance;

import java.io.Serializable;

class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String city;
	public Address(){ System.out.println("Address no args.");}

	public Address(String city){
		super();
		this.city = city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return this.city;
	}
}