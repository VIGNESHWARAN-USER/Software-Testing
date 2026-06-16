package iostream;

import java.io.Serializable;

public class Employee implements Serializable{
	
	public int id;
	public String name;
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}
