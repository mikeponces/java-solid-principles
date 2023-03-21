package com.pluralsight.solid.srp.good;

public class ConsoleLogger {
	public void writeInfo(String msg) {
		System.out.println("Info: " + msg);
	}

	public void writeError(String msg) {
		System.out.println("Error: " + msg);
	}
}
