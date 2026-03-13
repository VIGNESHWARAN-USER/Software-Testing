package exceptionhandling;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

class InvalidEmpNumberException extends Exception {
    public InvalidEmpNumberException(String msg) {
        super(msg);
    }
}

class InvalidDateOfJoinException extends Exception {
    public InvalidDateOfJoinException(String msg) {
        super(msg);
    }
}  

class EmployeeException {

    int empCode;
    String name;
    LocalDate dob;
    LocalDate doj;

    public EmployeeException(int empCode, String name, LocalDate dob, LocalDate doj) {
        this.empCode = empCode;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    public void display() {

        int experience = Period.between(doj,LocalDate.now()).getYears();

        System.out.println("Employee Code : "+empCode);
        System.out.println("Name : "+name);
        System.out.println("Date of Birth : "+dob);
        System.out.println("Date of Appointment : "+doj);
        System.out.println("Years of Experience: "+experience);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        try {

            System.out.print("Enter Employee Code : ");
            int code = sc.nextInt();
            sc.nextLine();

            if(code<=0){
                throw new InvalidEmpNumberException("Employee code must be positive.");
            }

            System.out.print("Enter Employee Name :");
            String name=sc.nextLine();

            System.out.print("Enter Date of Birth (yyyy-mm-dd) :");
            LocalDate dob=LocalDate.parse(sc.nextLine());

            System.out.print("Enter Date of Appointment (yyyy-mm-dd) :");
            LocalDate doj=LocalDate.parse(sc.nextLine());

            if(!dob.isBefore(doj)) {
                throw new InvalidDateOfJoinException("DOB must be before Date of Appointment.");
            }

            EmployeeException emp=new EmployeeException(code,name,dob,doj);

            System.out.println("\nEmployee Details");
            emp.display();

        } 
        catch(InvalidEmpNumberException | InvalidDateOfJoinException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}