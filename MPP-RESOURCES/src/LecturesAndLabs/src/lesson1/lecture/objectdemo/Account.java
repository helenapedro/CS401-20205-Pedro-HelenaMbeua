package LecturesAndLabs.src.lesson1.lecture.objectdemo;

public class Account {
	private String id;
    private double balance = 0.0;

    Account() {
		id = generateId();
	}

	public void updateBalance(double amount) {
		balance += amount;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getId() {
		return id;
	}
	
	private String generateId() {
		//in reality, read from a database or
		//external data source
		return "" + RandomNumbers.getRandomInt(1000,9999);
	}
	
	
}
