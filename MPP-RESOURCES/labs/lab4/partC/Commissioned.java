package labs.lab4.partC;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
    private double commission, baseSalary;
    private List<Order> orders;

    public Commissioned(double commission, double baseSalary) {
        this.commission = commission;
        this.baseSalary = baseSalary;
        orders = new ArrayList<>();
    }

//    public void addOrder(Order o) {
//        if (o == null) throw new NullPointerException("Null order cannot be added");
//        orders.add(o);
//    }

    @Override
    double calculateGrossPay(int month, int year) {
        int prevMonth = (month == 1) ? 12 : month - 1;
        int prevYear = (month == 1) ? year - 1 : year;

        double totalSales = orders.stream()
                .filter(o -> o.getOrderDate().getMonthValue() == prevMonth &&
                        o.getOrderDate().getYear() == prevYear)
                .mapToDouble(Order::getOrderAmount)
                .sum();
        return baseSalary + commission * totalSales;
    }
}
