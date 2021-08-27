package com.bridgelabz.employeewagebuilder;

public class CompanyEmpWage 
{
	public String COMPANY;
	public int EMPLOYEE_RATE_PER_HOUR;
	public int NUMBER_OF_WORKING_HOURS;
	public int MAXIMUM_HOURS_PER_MONTH ;
	public int TOTAL_WAGE;
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
		this.COMPANY = company;
		this.EMPLOYEE_RATE_PER_HOUR = empRatePerHour;
		this.NUMBER_OF_WORKING_HOURS = numOfWorkingDays;
		this.MAXIMUM_HOURS_PER_MONTH = maxHoursPerMonth;
	}
	public void setTotalEmpWage (int totalEmpWage) 
	{
		this.TOTAL_WAGE = totalEmpWage;
	}
	
	@Override
	public String toString() 
	{
		return "The total wage of employee in "+COMPANY+" is : "+ TOTAL_WAGE;
	}
}
