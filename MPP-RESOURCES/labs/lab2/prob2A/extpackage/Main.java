package labs.lab2.prob2A.extpackage;

import labs.lab2.prob2A.GradeReport;
import labs.lab2.prob2A.Student;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Helena");
        st.getGradeReport().setGrade("A");

        System.out.println("Helena's grade: " + st.getGradeReport().getGrade());

        GradeReport report = st.getGradeReport();
        System.out.println("Owner of report: " + report.getOwner());
    }
}
