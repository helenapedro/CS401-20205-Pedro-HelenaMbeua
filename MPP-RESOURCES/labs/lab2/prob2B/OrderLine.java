package labs.lab2.prob2B;

public class OrderLine {
    private String name;
    private Order order;

    public OrderLine(String name, Order order) {
        this.name = name;
        this.order = order;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }
}
