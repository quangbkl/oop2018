package week5_6;

import java.util.ArrayList;
import java.util.Iterator;

public class Layer {
    private ArrayList<Shape> shapes;
    private boolean visible;

    public Layer(ArrayList<Shape> shapes) {
        this.shapes = shapes;
        this.visible = true;
    }

    public Layer() {
        this.shapes = new ArrayList<>();
        this.visible = true;
    }

    public ArrayList<Shape> getShapesVisible() {
        if (!visible) {
            ArrayList<Shape> result = new ArrayList<>();
            return result;
        }

        return shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public void removeTriangle() {
        Iterator<Shape> iter = shapes.iterator();
        while (iter.hasNext()) {
            Shape item = iter.next();
            if (item instanceof Triangle) {
                iter.remove();
            }
        }
    }

    public void removeCircle() {
        Iterator<Shape> iter = shapes.iterator();
        while (iter.hasNext()) {
            Shape item = iter.next();
            if (item instanceof Circle) {
                iter.remove();
            }
        }
    }

    public void removeRectangle() {
        Iterator<Shape> iter = shapes.iterator();
        while (iter.hasNext()) {
            Shape item = iter.next();
            if (item instanceof Rectangle) {
                iter.remove();
            }
        }
    }

    public void removeSquare() {
        Iterator<Shape> iter = shapes.iterator();
        while (iter.hasNext()) {
            Shape item = iter.next();
            if (item instanceof Square) {
                iter.remove();
            }
        }
    }

    public void printShapes() {
        if (!visible) return;

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    public void trimShapes() {
        for (int i = 0; i < shapes.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    count++;
                }
            }
            if (count > 0) shapes.remove(i--);
        }
    }
}
