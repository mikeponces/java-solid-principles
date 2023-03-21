package com.pluralsight.solid.srp;

public class GoodExample {
	class ConsoleLogger {
		void logInfo(String msg) {
			System.out.println(msg);
		}

		void logError(String msg, Exception e) {
		}
	}

//	Income getIncome(Employee e, Repository repo) {
//		Income income = repo.getIncome(e.id);
//		return income;
//	}
}
