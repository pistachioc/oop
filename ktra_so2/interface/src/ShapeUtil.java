public class ShapeUtil {
    
    /**
     * printInfo.
     */
    public static String printInfo(java.util.List<GeometricObject> shapes) {
        String first = "Circle:\n";
        String second = "Triangle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                first += shape.getInfo() + "\n";
            } else if (shape instanceof Triangle) {
                second += shape.getInfo() + "\n";
            }
        }
        return first + second;
    }
}
