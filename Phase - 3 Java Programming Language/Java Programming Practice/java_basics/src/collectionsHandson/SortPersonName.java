package collectionsHandson;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>
{
	private String firstName;
	private String lastName;
	
	
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	
	

	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	@Override
	public String toString() {
		return firstName + " " + lastName;
	}





	@Override
	public int compareTo(Person o) {
		return this.firstName.compareTo(o.getFirstName());
	}
	
	
}

public class SortPersonName {
	public static void main(String args[])
	{
		ArrayList<Person> personList = new ArrayList<>();
		
		personList.add(new Person("Priscilla", "Wagner"));
		personList.add(new Person("Tom", "Parker"));
		personList.add(new Person("Elvis", "Presley"));
		
		Collections.sort(personList);
		
		for(Person i : personList)
		{
			System.out.println(i);
		}
		
	}
}
