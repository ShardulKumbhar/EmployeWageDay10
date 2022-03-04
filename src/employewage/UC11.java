package employewage;

import java.util.Scanner;

public class UC11 {
	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		System.out.println("Calculating wages for employees");
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyDetailsForEmpWage("Dmart", 10, 20, 16);
		empWageBuilder.addCompanyDetailsForEmpWage("BigBasket", 20, 20, 20);
		empWageBuilder.addCompanyDetailsForEmpWage("Reliance", 10, 20, 10);
		empWageBuilder.companyEmpWage();
	}
}