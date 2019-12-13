public class Cylinder extends Figure {
    protected double radius, hight;

    Cylinder(double r, double h) {
        radius = r;
        hight = h;
    }

    @Override
    public double getSq() {
        Cicle base = new Cicle(radius);
        Rect side = new Rect(hight, base.getP());
        double sqOfBase = base.getSq();
        double sqOfSide = side.getSq();
        return (2*sqOfBase + sqOfSide);
    }
}
