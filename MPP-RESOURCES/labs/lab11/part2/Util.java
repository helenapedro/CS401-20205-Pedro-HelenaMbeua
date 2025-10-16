package labs.lab11.part2;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Util {
    // Find all the students that are taking a given course
    public static List<Student> studentsTakingGivenCourse(List<Student> students, String courseCode) {
        return students.stream()
                .filter(st -> st.getSections() != null)
                .filter(st -> st.getSections().stream()
                        .map(Section::getCourseCode)
                        .toList()
                        .contains(courseCode)
                )
                .toList();
    }

    // Get the address of any student that is taking a given course (e.g., "CS401")
    public static Optional<Address> anyAddressForCourse(List<Student> students, String courseCode) {
        return students.stream()
                .flatMap(stu -> stu.getSections().stream()
                        .filter(sec -> courseCode.equals(sec.getCourseCode()))
                        .map(sec -> stu.getAddress()))
                .filter(Objects::nonNull)
                .findAny();
    }


    // Calculate the GPA for a given student

    // Find the student with the highest GPA

    // Get a list of all unique courses taken by students

    // Find all students who live in a given city (e.g., "Fairfield") sorted in alphabetical order

    // Count the number of students enrolled in a specific course (e.g., "CS401")

    // Get a list of students in a specific section

    //  Get the names of students who have enrolled in more than a given number of courses (e.g., more than 2 courses)

    // Get a list of unique course names taken by students who live in a given city (e.g., "Fairfield")

    // Get a list of distinct addresses of students who are taking a specific course (e.g., "CS401")

    // Get a mapping of students' names to the list of courses they are taking
}
