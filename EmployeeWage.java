package com.day10Emp;

public class EmployeeWage {

	public static final int Part_Time = 1;
	public static final int Full_Time = 2;

	private final String company;
	private final int empWagePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth ;
	private int totalWage;
	public EmployeeWage(String company, int empWagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.company = company;
		this.empWagePerHour = empWagePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	
	}
	
	public void computerWage() {
		int empHour = 0;
		int totalEmphours = 0;
		int totalworkingday = 0;
		
		while (totalEmphours <= maxHoursPerMonth && totalworkingday < numOfWorkingDays) {
			totalworkingday++;
			
		int empCheck = (int) Math.floor(Math.random()*10)/3;
		
		switch(empCheck) {
		case 1:
			System.out.println("Employee Present in part time ");
			empHour = 4;
			break;
		case 2:
			System.out.println("Employee Present in Full time");
			empHour = 8;
			break;
		default :
			System.out.println("Employee is Absent");
			empHour = 0;
		
		}
		totalEmphours = totalEmphours + empHour;
		System.out.println("Days :" + totalworkingday + "Employee hours : " + empHour);
		}
		totalWage = totalEmphours * empWagePerHour;
		
	}
	public String toString() {
		return "Total Emp wage for Company : " + company + " is " + totalWage;
		
	}
	
	public static void main(String[] args) {
		EmployeeWage tcs = new EmployeeWage("TCS", 20, 2, 10);
		EmployeeWage infosys = new EmployeeWage("Infosys", 10, 4, 20);
		tcs.computerWage();
		System.out.println(tcs);
		infosys.computerWage();
		System.out.println(infosys);
	
	}
	
	
	
	
}
