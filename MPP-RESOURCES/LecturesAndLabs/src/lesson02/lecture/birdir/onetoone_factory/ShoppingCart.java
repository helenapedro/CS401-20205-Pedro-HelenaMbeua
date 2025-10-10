package LecturesAndLabs.src.lesson02.lecture.birdir.onetoone_factory;

import java.util.*;

public class ShoppingCart {
	private Customer owner;
	private List<Item> items = new ArrayList<>();;

	// package level
	ShoppingCart(Customer cust) {
		owner = cust;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public List<Item> getItems() {
		return items;
	}

	public Customer getOwner() {
		return owner;
	}

}
