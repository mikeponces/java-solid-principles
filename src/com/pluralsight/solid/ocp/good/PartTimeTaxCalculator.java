package com.pluralsight.solid.ocp.good;

import com.pluralsight.solid.ocp.Employee;

@CalculatorDetails(type = "Part-Time")
public class PartTimeTaxCalculator implements TaxCalculator {

	@Override
	public double calculate(Employee employee) {
		return 2;
	}
}
