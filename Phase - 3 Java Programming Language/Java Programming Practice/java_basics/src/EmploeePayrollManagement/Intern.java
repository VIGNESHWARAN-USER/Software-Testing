package EmploeePayrollManagement;

public class Intern extends Employee{
	private double stipend;

	public Intern(String empId, String empName, double empSalary, double stipend) {
		super(empId, empName, empSalary);
		this.stipend = stipend;
	}
	
	public double calculateSalary()
	{
		return stipend;
	}
}
