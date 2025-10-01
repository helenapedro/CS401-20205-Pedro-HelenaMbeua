package labs.lab3.prob1.before;

public class PersonWithJob extends Person {
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;

		PersonWithJob p = (PersonWithJob)aPerson;

		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2)); // false
		System.out.println("p2.equals(p1)? " + p2.equals(p1)); // true

        // p1 is PersonWithJob and p2 is Person
        // PersonWithJob has its own form of equals,
        // which creates a serious problem called 'asymmetry'
        // 'p1.equals(p2)' compares two objects using PersonWithJob
        // equals method. It compares two object's name. If it is not equal return false, otherwise it compares
        // two object's salary. In this case p1 has salary 30000, p2 doesn't have salary
	}


}
