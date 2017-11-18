package serialization;

import java.io.Serializable;

final class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String city;
	public Address(){}
	public Address(String city){
		this.city = city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return this.city;
	}
}