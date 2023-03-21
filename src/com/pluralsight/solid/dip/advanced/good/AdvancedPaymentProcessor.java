package com.pluralsight.solid.dip.advanced.good;

import java.util.List;
import java.util.function.Supplier;

public class AdvancedPaymentProcessor {
	private EmployeeRepository repository;
	private EmployeeNotifier notifier;

	public AdvancedPaymentProcessor(Supplier<EmployeeRepository> repositorySupplier, Supplier<EmployeeNotifier> notifierSupplier) {
		this.repository = repositorySupplier.get();
		this.notifier = notifierSupplier.get();
	}

	public int sendPayments() {
		List<Employee> employees = repository.findAll();
		int totalPayments = 0;

		for (Employee e : employees) {
			totalPayments += e.getMonthlyIncome();
			notifier.notify(e);
		}

		return totalPayments;
	}
}
