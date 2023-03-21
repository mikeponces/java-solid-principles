package com.pluralsight.solid.ocp.good;

import com.pluralsight.solid.ocp.Employee;

@CalculatorDetails(type = "Full-Time")
public class FullTimeTaxCalculator implements TaxCalculator {

	@Override
	public double calculate(Employee employee) {
		return 1;
	}
}
