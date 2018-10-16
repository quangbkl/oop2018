package week5_6;

import week5_6.graphical.DrawShape;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> layers;
    private DrawShape drawShape = new DrawShape();

    public Diagram(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public Diagram() {
        this.layers = new ArrayList<>();
    }

    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public void addLayer(Layer layer) {
        this.layers.add(layer);
    }

    public void removeTriangle() {
        for (Layer layer : layers) {
            layer.removeTriangle();
        }
    }

    public void removeCircle() {
        for (Layer layer : layers) {
            layer.removeCircle();
        }
    }

    public void removeRectangle() {
        for (Layer layer : layers) {
            layer.removeRectangle();
        }
    }

    public void removeSquare() {
        for (Layer layer : layers) {
            layer.removeSquare();
        }
    }

    public ArrayList<Shape> getShapesVisible() {
        ArrayList<Shape> result = new ArrayList<>();
        for (Layer layer : layers) {
            result.addAll(layer.getShapesVisible());
        }

        return result;
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> result = new ArrayList<>();
        for (Layer layer : layers) {
            result.addAll(layer.getShapes());
        }

        return result;
    }

    public void customLayer() {
        Layer circles = new Layer();
        Layer triangles = new Layer();
        Layer rectangles = new Layer();
        Layer squares = new Layer();
        Layer hexagons = new Layer();

        ArrayList<Shape> shapes = this.getShapes();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) circles.addShape(shape);
            if (shape instanceof Triangle) triangles.addShape(shape);
            if (shape instanceof Rectangle) rectangles.addShape(shape);
            if (shape instanceof Square) squares.addShape(shape);
            if (shape instanceof Hexagon) hexagons.addShape(shape);
        }

        layers.clear();
        layers.add(circles);
        layers.add(triangles);
        layers.add(rectangles);
        layers.add(squares);
        layers.add(hexagons);
    }

    public void play() {
        ArrayList<Shape> shapes = this.getShapesVisible();
        for (Shape shape : shapes) {
            shape.moving();
        }
        drawShape.drawShapes(shapes);
    }

    public void printLayers() {
        for (Layer layer : layers) {
            System.out.println("[PRINT LAYER]: ");
            layer.printShapes();
            System.out.println("---------------");
        }
    }
}
