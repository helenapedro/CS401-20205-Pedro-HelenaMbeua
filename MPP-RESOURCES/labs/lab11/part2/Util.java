package labs.lab11.part2;

import java.util.*;
import java.util.stream.Collectors;

public class Util {
    // Find all the students that are taking a given course
    public static List<Student> studentsTakingGivenCourse(List<Student> students, String courseCode) {
        return students.stream()
                .filter(st -> st.getSections()!=null && !st.getSections().stream()
                        .filter(sec -> courseCode.equals(sec.getCourseCode())).toList().isEmpty()
                ).toList();
    }

    // Get the address of any student that is taking a given course (e.g., "CS401")
    public static Optional<Address> anyAddressForCourse(List<Student> students, String courseCode) {
        return students.stream()
                .filter(st -> st.getSections()!=null && !st.getSections().stream()
                        .filter(sec -> courseCode.equals(sec.getCourseCode())).toList().isEmpty()
                )
                .map(Student::getAddress)
                .findAny();
    }

    // Calculate the GPA for a given student
    public static double calculateGPA(Student st) {
        List<Double> gs = st == null ? null : st.getGrades();
        return (gs == null || gs.isEmpty())
                ? 0.0 : gs.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    // Find the student with the highest GPA
    public static Optional<Student> highestGpaStudent(List<Student> students) {
        return students.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingDouble(Util::calculateGPA));
    }

    // Get a list of all unique courses taken by students
    public static List<String> getAllUniqueCourses(List<Student> students) {
        return students.stream()
                .filter(st -> st.getSections() != null)
                .flatMap(st -> st.getSections().stream().map(Section::getCourseCode))
                .distinct()
                .toList();
    }

    // Find all students who live in a given city (e.g., "Fairfield") sorted in alphabetical order
    public static List<Student> getByCitySorted(List<Student> students, String city) {
        return students.stream()
                .filter(st -> city.equals(st.getAddress().getCity()))
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    // Count the number of students enrolled in a specific course (e.g., "CS401")
    public static long countStudentsInCourse(List<Student> students, String courseCode) {
        return studentsTakingGivenCourse(students, courseCode).size();
    }

    // Get a list of students in a specific section
    public static List<Student> studentsInSection(List<Student> students, int sectionId) {
        return students.stream()
                .filter(st -> st.getSections()!=null && !st.getSections().stream()
                        .filter(sec -> sectionId == sec.getId()).toList().isEmpty()
                )
                .toList();
    }

    //  Get the names of students who have enrolled in more than a given number of courses (e.g., more than 2 courses)
    public List<String> getStudentsEnrolledInMoreCourses(List<Student> students, int x) {
        if (x < 0) throw new IllegalArgumentException("X < 0");
        return students.stream()
                .filter(st -> st.getSections() != null && st.getSections().size() > x)
                .map(Student::getName).toList();
    }


    // Get a list of unique course names taken by students who live in a given city (e.g., "Fairfield")
    public List<String> getUniqueCourses(List<Student> students, String city) {
        return students.stream()
                .filter(st -> city.equals(st.getAddress().getCity()))
                .flatMap(st -> st.getSections().stream().map(Section::getCourseCode))
                .distinct()
                .collect(Collectors.toList());
    }

    // Get a list of distinct addresses of students who are taking a specific course (e.g., "CS401")
    public List<Address> getDistinctAddress(List<Student> students, String courseCode) {
        return students.stream()
                .filter(st -> st.getSections()!=null && !st.getSections().stream()
                        .filter(sec -> courseCode.equals(sec.getCourseCode())).toList().isEmpty()
                ).map(Student::getAddress).distinct().toList();
    }

    // Get a mapping of students' names to the list of courses they are taking
    public static Map<String, List<Section>> getStudentListOfCourses(List<Student> students) {
        return students.stream()
                .peek(st -> {
                    if (st.getSections() == null)
                        st.setSections(new ArrayList<>());
                })
                .collect(Collectors.toMap(Student::getName, Student::getSections));
    }
}
