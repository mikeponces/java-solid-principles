package com.pluralsight.solid.ocp.good;

import com.pluralsight.solid.ocp.Employee;
import com.pluralsight.solid.ocp.Intern;

public class Demo {
	public static void main(String[] args) {
		Employee employee = new Intern();
		TaxCalculator calculator;

		try {
			calculator = TaxCalculatorFactory.findCalculator(employee.getType());
			System.out.println(calculator.calculate(employee));
		} catch (InvalidEmployeeTypeException e) {
			e.printStackTrace();
		}
	}
}
