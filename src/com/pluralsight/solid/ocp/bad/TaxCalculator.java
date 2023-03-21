package com.pluralsight.solid.ocp.bad;

import com.pluralsight.solid.ocp.Employee;
import com.pluralsight.solid.ocp.FullTimeEmployee;
import com.pluralsight.solid.ocp.Intern;
import com.pluralsight.solid.ocp.PartTimeEmployee;

public class TaxCalculator {

	public double calculate(Employee employee) {
		if(employee instanceof FullTimeEmployee) {
			// some logic
		}

		if(employee instanceof PartTimeEmployee) {
			// some logic
		}

		if(employee instanceof Intern) {
			// some logic
		}
		return 0;
	}
}
