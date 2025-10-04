package labs.lab5.prob3;

final public class Rectangle extends ClosedCurve{
    final private double width;
    final private double height;

    public Rectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    @Override
    public double computeArea(){
        return width * height;
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return height;
    }
}
