package labs.lab2.prob2B.extpackage;

import labs.lab2.prob2B.Order;
import labs.lab2.prob2B.OrderLine;

public class Main {
    public static void main(String[] args) {
        Order ord1 = new Order();
        ord1.addOrderLines(new OrderLine("Product1", ord1));
        ord1.addOrderLines(new OrderLine("Product2", ord1));
        ord1.addOrderLines(new OrderLine("Product3", ord1));

        System.out.println(ord1);
    }
}
