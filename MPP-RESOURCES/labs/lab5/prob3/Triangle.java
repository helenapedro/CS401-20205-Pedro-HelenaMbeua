package labs.lab5.prob3;

final public class Triangle extends ClosedCurve{
    private final double base;
    private final double height;

    public Triangle(double base, double height){
        if (height <= base) {
            this.base = base;
            this.height = height;
        }
        else {
            this.base = height;
            this.height = base;
        }
        assert(height <= base);
    }

    @Override
    public double computeArea() {
        return (0.5 * base * height);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
