package labs.lab4.partE;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        return list.stream()
                .mapToDouble(Employee::computeUpdatedBalanceSum)
                .sum();
    }
}
