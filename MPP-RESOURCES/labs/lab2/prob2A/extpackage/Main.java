package labs.lab2.prob2A.extpackage;

import labs.lab2.prob2A.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> listOfStudents = createListOfStudents();
        assignGrades(listOfStudents, new String[]{"before.A", "before.B", "before.A", "before.C"});
        System.out.println("Students and their grades:\n  " + listOfStudents);

        //no way to create a GradeReport first, and pass in a student
        //GradeReport g = new GradeReport(null);
    }

    private static List<Student> createListOfStudents() {
        Student st1 = new Student("Helena");
        Student st2 = new Student("Azeem");
        Student st3 = new Student("Omar");
        Student st4 = new Student("Nuer");
        return Arrays.asList(st1, st2, st3, st4);
    }
    private static void assignGrades(List<Student> list, String[] grades) {
        for(int i = 0; i < grades.length; ++i) {
            list.get(i).getReport().setGrade(grades[i]);
        }
    }
}
