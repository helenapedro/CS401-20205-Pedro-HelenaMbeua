package labs.lab10.prob2.partA;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int byName = e1.name.compareTo(e2.name);
        if (byName != 0) return byName;
        // only return 0 if salary are also equals
        return Integer.compare(e1.salary, e2.salary);
    }
}
