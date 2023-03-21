package com.pluralsight.solid.dip.bad;

public class PaymentProcessor {
	public void pay(String productId) {
		SqlProductRepo repo = new SqlProductRepo(); // dependent to SqlProductRepo
		Product product = repo.getById(productId);
		this.processPayment(product);
	}

	private void processPayment(Product product) {

	}
}
