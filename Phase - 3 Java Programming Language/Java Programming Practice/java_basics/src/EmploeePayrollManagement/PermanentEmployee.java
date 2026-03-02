package EmploeePayrollManagement;

public class PermanentEmployee extends Employee{
	private double empBonus;

	public PermanentEmployee(String empId, String empName, double empSalary, double empBonus) {
		super(empId, empName, empSalary);
		this.empBonus = empBonus;
	}
	
	public double calculateSalary()
	{
		return super.getEmpSalary() + empBonus;
	}
	
}
