package labs.lab2.prob2A;

public class GradeReport {
    private String grade;
    private Student owner;

    GradeReport(Student student) {
        this.grade = "";
        owner = student;
    }

    public Student getOwner() {
        return owner;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
