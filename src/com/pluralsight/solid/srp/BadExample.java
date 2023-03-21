package com.pluralsight.solid.srp;

public class BadExample {

	public void branching() {
		Employee employee = new Employee();
		if (employee.getMonthlyIncome() > 2000) {
			// some logic
		} else {
			// some logic
		}

		switch (employee.getNbHoursPerWork()) {
		case 40: {
			// some logic
		}
		case 20: {
			// some logic
		}
		}
	}

	// requires many import dependencies
	public void monsterMethods() {
//		Income income = employeeRepository.getIncome(e.id); // 1 gets income
//		StateAuthorityApi.send(income, e.fullName);
//		Payslip payslip =  PayslipGenerator.get(income); // 2 generates payslip
//		JsonObject payslipJson = convertToJson(payslip); // 3 converst to json
//		EmailService.send(e.email, payslipJson); // 4 sends email
//
//		return income;
	}

//	Income getIncome(Employee e) {
//		RepositoryImpl repo = new RepositoryImpl(srv, port, db);
//		Income income = repo.getIncome(e.id);
//		return income;
//	}

	class Employee {
		public int getMonthlyIncome() {
			return 0;
		}

		public int getNbHoursPerWork() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}
