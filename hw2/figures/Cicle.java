public class Cicle extends Figure {
    protected double radius;

    Cicle(double r) {
        radius = r;
    }

    public double getP(){
        return (2*Math.PI*radius);
    }

    @Override
    public double getSq() {
        return (Math.PI * radius * radius);
    }
}
