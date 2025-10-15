package lesson10.lecture.comparator1;

import java.util.Comparator;

/* before.A functor, but not a closure */
public class EmployeeNameComparator 
       implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
