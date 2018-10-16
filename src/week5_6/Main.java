package week5_6;

public class Main {
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        Layer layer3 = new Layer();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();
        circle1.randomProperties();
        circle2.randomProperties();
        circle3.randomProperties();
        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape triangle3 = new Triangle();
        triangle1.randomProperties();
        triangle2.randomProperties();
        triangle3.randomProperties();
        Shape rectangle1 = new Rectangle();
        Shape rectangle2 = new Rectangle();
        Shape rectangle3 = new Rectangle();
        rectangle1.randomProperties();
        rectangle2.randomProperties();
        rectangle3.randomProperties();
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape square3 = new Square();
        square1.randomProperties();
        square2.randomProperties();
        square3.randomProperties();
        Hexagon hexagon1 = new Hexagon();
        Hexagon hexagon2 = new Hexagon();
        Hexagon hexagon3 = new Hexagon();
        hexagon1.randomProperties();
        hexagon2.randomProperties();
        hexagon3.randomProperties();
        layer1.addShape(circle1);
        layer1.addShape(triangle1);
        layer1.addShape(rectangle1);
        layer1.addShape(square1);
        layer1.addShape(hexagon1);
        layer2.addShape(circle2);
        layer2.addShape(triangle2);
        layer2.addShape(rectangle2);
        layer2.addShape(square2);
        layer2.addShape(hexagon2);
        layer3.addShape(circle3);
        layer3.addShape(triangle3);
        layer3.addShape(rectangle3);
        layer3.addShape(square3);
        layer3.addShape(hexagon3);
        diagram.addLayer(layer1);
        diagram.addLayer(layer2);
        diagram.addLayer(layer3);
//        diagram.removeTriangle();
//        layer1.setVisible(false);
//        layer1.removeRectangle();
//        layer1.addShape(circle1);
//        layer1.addShape(circle2);
//        layer1.addShape(circle3);
//        layer1.trimShapes();
//        diagram.customLayer();
//        diagram.printLayers();
        while (true) {
            diagram.play();
//            diagram.printLayers();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
