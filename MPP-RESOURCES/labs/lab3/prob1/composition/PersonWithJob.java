package labs.lab3.prob1.composition;

public class PersonWithJob {
	private double salary;
    private Person person;
	
	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		salary = s;
        person = new Person(n);
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob p)) return false;

        return this.person.getName().equals(p.person.getName()) &&
				this.getSalary()==p.getSalary();
	}
	public static void main(String[] args) {
        PersonWithJob pwjob = new PersonWithJob("Joe", 30000);
		Person p1 = pwjob.person;
		Person p2 = new Person("Joe");

		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2)); // true
		System.out.println("p2.equals(p1)? " + p2.equals(p1)); // true
	}
}
