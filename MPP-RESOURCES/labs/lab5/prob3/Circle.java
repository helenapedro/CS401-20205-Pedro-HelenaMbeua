package labs.lab5.prob3;

final public class Circle extends ClosedCurve{
    final private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
