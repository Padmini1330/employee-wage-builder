package com.bridgelabz.employeewagebuilder;

public class EmployeeWageBuilder 
{

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmployeeWageBuilder(){
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage() {
		for(int i=0; i< numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	public  int  computeEmpWage(CompanyEmpWage companyEmpWage) {

		//variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
		//computation
		while(totalEmpHrs <= companyEmpWage.MAXIMUM_HOURS_PER_MONTH && totalWorkingDays < companyEmpWage.NUMBER_OF_WORKING_HOURS) {
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
		return totalEmpHrs *companyEmpWage.EMPLOYEE_RATE_PER_HOUR;
		
	}
	
	
	public static void main(String[] args) {
		EmployeeWageBuilder employeeObject = new EmployeeWageBuilder();
		employeeObject.addCompanyEmpWage("Dmart",20, 5, 50);
		employeeObject.addCompanyEmpWage("Reliance",22, 6, 60);
		
		employeeObject.computeEmpWage();
		

		
	}
}
