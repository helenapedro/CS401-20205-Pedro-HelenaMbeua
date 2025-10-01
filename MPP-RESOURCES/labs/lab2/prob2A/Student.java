package labs.lab2.prob2A;

public class Student {
    private final String name;
    private final GradeReport gradeReport;

    public Student(String name) {
        this.name = name;
        gradeReport = new GradeReport(this);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }
}
