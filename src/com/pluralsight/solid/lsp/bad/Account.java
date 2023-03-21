package com.pluralsight.solid.lsp.bad;

public interface Account {

	void processLocalTransfer(double amount);
	void processInternationalTransfer(double amount);
}
