package LecturesAndLabs.src.lesson02.lecture.bidir.onetoone_factory.extpackage;

import LecturesAndLabs.src.lesson02.lecture.birdir.onetoone_factory.CustShopCartFactory;
import LecturesAndLabs.src.lesson02.lecture.birdir.onetoone_factory.Customer;
import LecturesAndLabs.src.lesson02.lecture.birdir.onetoone_factory.Item;

public class Main {

	public static void main(String[] args) {
		
		//Create new customer
		Customer cust = CustShopCartFactory.createCustomer("Bob");
		cust.getCart().addItem(new Item("Shirt"));
		
		
		System.out.println(cust.getCart().getItems());
		
		//Cannot create Customer or ShoppingCart directly from Main
		//Customer c = new Customer("Bob") //compiler error
		//ShoppingCart s = new ShoppingCart();  //compiler error
		

	}

}
