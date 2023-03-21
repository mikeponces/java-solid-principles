package com.pluralsight.solid.isp.bad;

public interface ShoppingCart {
	void addItem(Item item);
	void removeItem(Item item);
	void processPayment();
	boolean checkItemInStock(Item item);
}
