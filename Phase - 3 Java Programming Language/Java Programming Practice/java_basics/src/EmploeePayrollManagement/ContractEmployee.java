package EmploeePayrollManagement;

public class ContractEmployee extends Employee{
	private double taxRate;
	private double serviceCharge;
	
	public ContractEmployee(String empId, String empName, double empSalary, double taxRate, double serviceCharge) {
		super(empId, empName, empSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}
	
	public double calculateSalary()
	{
		double baseSalary = super.getEmpSalary();
		return  baseSalary - (baseSalary*taxRate) - serviceCharge;
	}
}
