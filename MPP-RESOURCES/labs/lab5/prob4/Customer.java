package labs.lab5.prob4;

import java.util.*;

public class Customer {
	private String name;
	private List<Order> orders;

    Customer(String name) {
		this.name = name;
		orders = new ArrayList<>();
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}
}
