package labs.lab10.lambdaandmethodreference;

import java.util.function.*;

public class Example {
    public static void main(String[] args) {
        evaluator();
    }

    record Apple(double weight) {
        @Override
        public String toString() {
                return "Apple(" + weight + ")";
        }
    }

    public static void evaluator() {
        Employee e1 = new Employee("Helena", 150000);
        Employee e2 = new Employee("Joe", 100000);

        // A
        Function<Employee, String> getName1 = (Employee e) -> e.getName();
        Function<Employee, String> getName2 = Employee::getName; // Class::instanceMethod
        System.out.println("[A] " + getName1.apply(e1) + " / " + getName2.apply(e2));

        // B
        BiConsumer<Employee, String> setName1 = (ee, s) -> ee.setName(s);
        BiConsumer<Employee, String> setName2 = Employee::setName; // Class::instanceMethod
        setName1.accept(e1, "Jane Doe");
        setName2.accept(e2, "Jon Smith");
        System.out.println("[B] " + e1 + " | " + e2);

        // C
        BiFunction<String, String, Integer> compare1 = (s1, s2) -> s1.compareTo(s2);
        BiFunction<String, String, Integer> compare2 = String::compareTo; // Class::instanceMethod
        System.out.println("[C] " + compare1.apply("abc","abd") + " / " + compare2.apply("abc","abc"));

        // D
        BiFunction<Integer, Integer, Double> pow1 = (x, y) -> Math.pow(x, y);
        BiFunction<Integer, Integer, Double> pow2 = Math::pow; // Class::staticMethod
        System.out.println("[D] " + pow1.apply(2, 10) + " / " + pow2.apply(3, 3));

        // E
        Apple a = new Apple(185.5);
        Function<Apple, Double> getWeight1 = (ap) -> ap.weight();
        Function<Apple, Double> getWeight2 = Apple::weight;
        System.out.println("[E] " + getWeight1.apply(a) + " / " + getWeight2.apply(a));

        // F
        Function<String, Integer> parse1 = s -> Integer.parseInt(s);
        Function<String, Integer> parse2 = Integer::parseInt; // Class::staticMethod
        System.out.println("[F] " + parse1.apply("42") + " / " + parse2.apply("007"));

        // G
        EmployeeNameComparator comp = new EmployeeNameComparator();
        BiFunction<Employee, Employee, Integer> cmp1 = (x, y) -> comp.compare(x, y);
        BiFunction<Employee, Employee, Integer> cmp2 = comp::compare; // object::instanceMethod
        System.out.println("[G] " + cmp1.apply(e1, e2) + " / " + cmp2.apply(e2, e1));
    }
}
