package com.pluralsight.solid.srp.good;

import java.io.IOException;
import java.util.List;

public class Demo {
	public static void main(String[] args) {

		EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
		ConsoleLogger consoleLogger = new ConsoleLogger();

		EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);
		List<Employee> employees = repository.findAll();

		for (Employee e : employees) {
			try {
				repository.save(e);
				consoleLogger.writeInfo("Saved employee: " + e);
			} catch (IOException ex) {
				consoleLogger.writeError(ex.getMessage());
			}
		}
	}
}
