package com.pluralsight.solid.srp.good;

import java.io.IOException;
import java.util.List;

public class EmployeeRepository {

	private EmployeeFileSerializer serializer;

	public EmployeeRepository(EmployeeFileSerializer serializer) {
		this.serializer = serializer;
	}

	// Let Caller handle Exception
	public void save(Employee employee) throws IOException {
		String serializedEmployee = this.serializer.serialize(employee);
		System.out.println(serializedEmployee);
		// Creates a File
		// Writes Employee record summary to the File
	}

	public List<Employee> findAll() {
		return null;
	}
}
