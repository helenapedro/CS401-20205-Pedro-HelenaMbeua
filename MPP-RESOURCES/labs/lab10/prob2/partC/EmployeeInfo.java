package labs.lab10.prob2.partC;

import java.util.*;

public class EmployeeInfo {
    enum SortMethod {BYNAME, BYSALARY};

    void sort(List<Employee> emps, SortMethod method) {
        emps.sort((e1, e2) ->
        {
            if (method == SortMethod.BYNAME) {
                int byName = e1.name.compareTo(e2.name);
                return (byName != 0) ? byName : Integer.compare(e1.salary, e2.salary);
            } else {
                int bySalary = Integer.compare(e1.salary, e2.salary);
                return  (bySalary != 0) ? bySalary : e1.name.compareTo(e2.name);
            }
        });
    }

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Andy", 60000));

        EmployeeInfo ei = new EmployeeInfo();

        ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
        System.out.println(emps);
        //same instance
        ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
        System.out.println(emps);
    }
}
