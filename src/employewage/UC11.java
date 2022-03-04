package employewage;

import java.util.Scanner;

public class UC11 {
	public static void main(String args[]) {
		// welcome message
		;
		System.out.println("Calculating wages for employees");
		System.out.println("Equires for daily wages");
		
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		
		empWageBuilder.addCompanyDetailsForEmpWage("Dominos", 10, 20, 16);
		empWageBuilder.addCompanyDetailsForEmpWage("BigBe", 20, 20, 20);
		empWageBuilder.addCompanyDetailsForEmpWage("mans", 10, 20, 10);
		
		empWageBuilder.companyEmpWage();  //enquirey
		empWageBuilder.printEmpWageForCompany();
	}
}