package com.attendenceManagementSystem;

import java.time.LocalTime;

public class Attendance {
	int empId;
	LocalTime checkInTime;
	LocalTime checkOutTime;
	boolean isCheckedIn;
	boolean isCheckedOut;
	
	public String markCheckIn()
	{
		if(isCheckedIn) return "The employee is already checked in";
		else
		{
			checkInTime = LocalTime.now();
			isCheckedIn = true;
			isCheckedOut = false;
			return "Check in process completed";
		}
	}
	
	public String markCheckOut()
	{
		if(!isCheckedIn) return "Cannot checkout, the employee is not checked in";
		else
		{
			checkOutTime = LocalTime.now();
			isCheckedOut = true;
			isCheckedIn = false;
			return "Check out process completed";
		}
	}
	
	public String getAttendanceDetails()
	{
		return "Employee ID: "+empId+
			   "\nCheckd In Time: "+checkInTime+
			   "\nChecked Out Time: "+checkOutTime;
	}
}
