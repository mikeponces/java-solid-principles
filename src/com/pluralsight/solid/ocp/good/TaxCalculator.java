package com.pluralsight.solid.ocp.good;

import com.pluralsight.solid.ocp.Employee;

public interface TaxCalculator {
	double calculate(Employee employee);
}
