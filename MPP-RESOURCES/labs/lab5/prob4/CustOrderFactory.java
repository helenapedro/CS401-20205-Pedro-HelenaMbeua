package labs.lab5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
    private CustOrderFactory() {}

    public static Customer createCustomer(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("name required");
        return new Customer(name);
    }

    public static Order newOrder(Customer cust, LocalDate date) {
        if(cust == null) throw new NullPointerException("Null customer");
        if (date == null) throw new IllegalArgumentException("date required");

        Order ord = new Order(date);
        cust.addOrder(ord);
        return ord;
    }

    public static Item createItem(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("item name required");
        return new Item(name);
    }
}
