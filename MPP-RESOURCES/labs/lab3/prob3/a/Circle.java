package labs.lab3.prob3.a;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
