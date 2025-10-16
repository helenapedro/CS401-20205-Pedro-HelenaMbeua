package labs.lab11.part2;

import java.util.List;

public class Student {
    public int id;
    public String name;
    public List<Double> grades;
    public List<Section> sections;
    public Address address;

    public Student(int id, String name, List<Double> grades, Address address) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.address = address;
    }

    public Student(int id, String name, List<Double> grades, Address address, List<Section> sections) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.address = address;
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
