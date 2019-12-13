public class Rect extends Figure{
    protected double hight, wide;

    Rect(double h, double w) {
        hight = h;
        wide = w;
    }

    @Override
    public double getSq() {
        return (hight*wide);
    }
}
