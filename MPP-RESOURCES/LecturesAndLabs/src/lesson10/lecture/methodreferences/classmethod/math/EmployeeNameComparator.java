package lesson10.lecture.methodreferences.classmethod.math;

import java.util.Comparator;

/* before.A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
