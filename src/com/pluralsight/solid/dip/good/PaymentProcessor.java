package com.pluralsight.solid.dip.good;

public class PaymentProcessor {
	private ProductRepo repo;

	// caller should pass repo object
	public PaymentProcessor(ProductRepo repo) {
		this.repo = repo;
	}

	public void pay(String productId) {
		// not responsible for creating repo object
		Product product = repo.getById(productId);
		this.processPayment(product);
	}

	private void processPayment(Product product) {
		// TODO Auto-generated method stub

	}
}
