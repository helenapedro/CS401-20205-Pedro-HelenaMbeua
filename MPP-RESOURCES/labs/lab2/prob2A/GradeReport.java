package labs.lab2.prob2A;

public class GradeReport implements Comparable<GradeReport>{
    private String grade;
    private Student student;

    GradeReport(Student st) {
        student = st;
    }

    @Override
    public int compareTo(GradeReport o) {
        return grade.compareTo(o.grade);
    }

    @Override
    public String toString() {
        return grade;
    }

    public Student getStudent() {
        return student;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
