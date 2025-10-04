package labs.lab5.prob3;

final public class Rectangle extends ClosedCurve{
    final private double width;
    final private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double computeArea(){
        return width * length;
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
}
