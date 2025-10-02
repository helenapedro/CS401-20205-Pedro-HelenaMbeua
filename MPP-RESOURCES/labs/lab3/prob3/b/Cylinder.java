package labs.lab3.prob3.b;

public class Cylinder {
    private double height;
    private Circle base;

    Cylinder(double radius, double height) {
        this.height = height;
        this.base = new Circle(radius);
    }

    public double computeVolume() {
        return base.computeArea() * height;
    }

    public double getHeight() {
        return height;
    }
}
