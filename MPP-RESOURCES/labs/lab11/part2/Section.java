package labs.lab11.part2;

public class Section {
    private int id;
    private String courseCode;

    public Section(int id, String courseCode) {
        this.id = id;
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Section{" +
                "courseCode='" + courseCode + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
