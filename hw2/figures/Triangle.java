public class Triangle extends Figure {
    protected double hight, base;

    Triangle(double h, double b) {
        hight = h;
        base = b;
    }

    @Override
    public double getSq() {
        return (0.5*hight*base);
    }
}
