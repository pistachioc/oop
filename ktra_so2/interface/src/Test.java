public class Test {
    public static void main (String args[]) {
        Circle c1 = new Circle(new Point(1.4324, 2.768), 5.0);
        Circle c2 = new Circle(new Point(3.12412, 453121), 10.0);
        Triangle t1 = new Triangle(new Point(1.4324, 2.768), new Point(3.12412, 453121), new Point(5.94832, 6.543241));
        Triangle t2 = new Triangle(new Point(7.4324, 8.124), new Point(9.4356, 10.65443), new Point(11.5462, 12.1471));
        // Triagle t3 = new Triagle(new Point(1, 1), new Point(2,2), new Point(3, 3));
        java.util.List<GeometricObject> shapes = new java.util.ArrayList<GeometricObject>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(t1);
        shapes.add(t2);
        System.out.println(ShapeUtil.printInfo(shapes));
    }
}
