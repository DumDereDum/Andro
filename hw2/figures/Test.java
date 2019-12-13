public class Test {
    public static void main(String args[]) {

        Rect r = new Rect(10, 3);
        System.out.println(r.getSq()); // 30

        Cicle c = new Cicle(1);
        System.out.println(c.getSq()); // 3.1415...

        Triangle t = new Triangle(1, 2);
        System.out.println(t.getSq()); // 1.0

        Trapeze tr = new Trapeze(1, 1, 3);
        System.out.println(tr.getSq()); // 2.0

        Cylinder cy = new Cylinder(2, 4);
        System.out.println(cy.getSq()); // 75.3982...
    }
}
