package com.pluralsight.solid.dip.advanced.bad;

import java.util.List;

public class AdvancedPaymentProcessor {
	private EmployeeRepository repository;

	// limited to file access, cannot change to DB access
	public AdvancedPaymentProcessor() { // new is glue
		EmployeeFileSerializer serializer = new EmployeeFileSerializer(); // initialized inside
		this.repository = new EmployeeRepository(serializer);
	}

	public int sendPayments() {
		List<Employee> employees = repository.findAll();
		int totalPayments = 0;

		for (Employee e : employees) {
			totalPayments += e.getMonthlyIncome();
			// limited to email sending, cannot change to other media
			EmailSender.notify(e);
		}

		return totalPayments;
	}
}
