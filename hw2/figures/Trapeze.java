public class Trapeze extends Figure{
    protected double hight, base1, base2;

    Trapeze(double h, double b1, double b2) {
        hight = h;
        base1 = b1;
        base2 = b2;
    }

    @Override
    public double getSq() {
        return (0.5*hight*(base1+base2));
    }
}
