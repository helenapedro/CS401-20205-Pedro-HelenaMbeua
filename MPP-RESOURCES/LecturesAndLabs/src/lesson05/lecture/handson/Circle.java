package LecturesAndLabs.src.lesson05.lecture.handson;

public class Circle implements Shape{
    private double radius;
    public Circle() {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double draw() {
        return 2 * Math.PI * radius;
    }
}
