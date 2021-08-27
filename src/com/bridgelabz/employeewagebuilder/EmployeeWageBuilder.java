package com.bridgelabz.employeewagebuilder;

public class EmployeeWageBuilder 
{

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth ;
	private int totalEmpWage;
	public EmployeeWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursInMonth;
	}

	public  void computeEmpWage() {		
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
		while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays ++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch (empCheck) {
			case IS_PART_TIME : 
				empHrs = 4;
				break;
			case IS_FULL_TIME :
				empHrs = 8;
				break;
			default :
				empHrs = 0;
			}

			totalEmpHrs += empHrs;
			System.out.println("Days#: "+totalWorkingDays+"     Emp Hrs: "+ empHrs);
		}
		totalEmpWage = totalEmpHrs *empRatePerHour;
		
	}

	@Override
	public String toString() {
		return "The total wage of employee in "+company+" is : "+ totalEmpWage;
	}
	public static void main(String[] args) {
		EmployeeWageBuilder dmart = new EmployeeWageBuilder("dmart",20, 12, 50);
		EmployeeWageBuilder reliance = new EmployeeWageBuilder("reliance",23, 6, 60);
		dmart.computeEmpWage();
		System.out.println(dmart);
		reliance.computeEmpWage();
		System.out.println(reliance);

	}}
