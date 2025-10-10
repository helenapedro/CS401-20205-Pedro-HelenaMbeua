package labs.lab2.prob2B;

public class OrderLine {
    private int lineNum, quantity;
    private double price;
    private Order order;

    //package level visibility
    public OrderLine(int lineNum, double price, int quantity, Order order) {
        this.lineNum = lineNum;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    @Override
    public String toString() {
        return "  line item: \n"  + "    line num = " + lineNum + "    price = " + price + "    quantity = "+ quantity;
    }
}
