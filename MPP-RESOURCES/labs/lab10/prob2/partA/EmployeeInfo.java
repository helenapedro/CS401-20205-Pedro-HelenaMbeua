package labs.lab10.prob2.partA;

import java.util.List;

public class EmployeeInfo {
    enum SortMethod {BYNAME, BYSALARY};
    private final SortMethod method;

    public EmployeeInfo(SortMethod method) {
        this.method = method;
    }

    public void sort(List<Employee> emps) {
        if(method == SortMethod.BYNAME) {
            emps.sort(new EmployeeNameComparator());
        }
        else if(method == SortMethod.BYSALARY) {
            emps.sort(new EmployeeSalaryComparator());
        }
    }

    public static void main(String[] args) {
        Employee joe1 = new Employee("Joe", 150000);
        Employee joe2 = new Employee("Joe", 100000);

        System.out.println(joe1.equals(joe2)); // false - equals in Employee class compares by name and salary

        EmployeeNameComparator nameComparator = new EmployeeNameComparator();
        System.out.println(nameComparator.compare(joe1, joe2));
    }
}
