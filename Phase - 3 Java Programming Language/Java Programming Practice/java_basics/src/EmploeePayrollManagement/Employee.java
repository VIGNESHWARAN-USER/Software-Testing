package EmploeePayrollManagement;

public class Employee {
	private String empId;
	private String empName;
	private double empSalary;
	
	public Employee(String empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}
	
	public double calculateSalary()
	{
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
