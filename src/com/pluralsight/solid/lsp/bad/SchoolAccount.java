package com.pluralsight.solid.lsp.bad;

public class SchoolAccount implements Account {

	@Override
	public void processLocalTransfer(double amount) {
		// some logic
	}

	@Override
	public void processInternationalTransfer(double amount) {
		throw new RuntimeException();
	}

}
