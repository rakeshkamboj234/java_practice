package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//can't serilize the objec with refference don't implemented serilization
class Test {
	public static void main(String args[]) {
		
		Address address = new Address();
		address.setCity("citry");
		Student student = new Student();
		student.setName("rakesh");
		student.setAddress(address);
		
		try {
			FileOutputStream fis = new FileOutputStream("employee.ser");
			ObjectOutputStream oi = new ObjectOutputStream(fis);
			System.out.println("Serialization is started.");
			oi.writeObject(student);
			oi.close();
			fis.close();
			System.out.println("Serialization is done.");
		} catch(Exception e){
			System.out.println("Exception occur due to - " + e);
			e.printStackTrace();
		} 
		
		try {
			FileInputStream fis = new FileInputStream("employee.ser");
			ObjectInputStream oi = new ObjectInputStream(fis);
			Student student1 = (Student)oi.readObject();
			System.out.println(student1.getName());
			System.out.println(student1.getAddress().getCity());
			oi.close();
			fis.close();
		} catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		} 
	}
}