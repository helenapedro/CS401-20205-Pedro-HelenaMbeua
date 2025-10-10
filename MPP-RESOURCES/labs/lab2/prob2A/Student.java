package labs.lab2.prob2A;

public class Student {
    private final String name;
    private final GradeReport report;

    public Student(String name) {
        this.name = name;
        report = new GradeReport(this);
    }

    @Override
    public String toString() {
        return name + ": " + report;
    }

    public String getName() {
        return name;
    }

    public GradeReport getReport() {
        return report;
    }
}
