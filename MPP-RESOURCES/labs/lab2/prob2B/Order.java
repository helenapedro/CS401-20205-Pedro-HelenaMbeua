package labs.lab2.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final LocalDate orderDate;
    private final List<OrderLine> orderLines;

    public Order () {
        this.orderDate = LocalDate.now();
        orderLines = new ArrayList<>();
        orderLines.add(new OrderLine("Default product ", this));
    }

    public void addOrderLines(OrderLine ol) {
        orderLines.add(ol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(orderDate.toString());
        sb.append("\n");
        for (OrderLine ol : orderLines) {
            sb.append(ol.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
