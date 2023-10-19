import java.util.ArrayList;

public class Layer {
    private java.util.List<Shape> shapes = new ArrayList<>();

    /**
     * addShape.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * removeCircle.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    /**
     * getInfo.
     */
    public String getInfo() {
        String info = "";
        for (int i = 0; i < shapes.size(); i++) {
            info += shapes.get(i).toString() + "\n";
        }
        return "Layer of crazy shapes:\n" + info;
    }

    /**
     * removeDuplicate.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}
