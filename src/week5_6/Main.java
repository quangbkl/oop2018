package week5_6;

public class Main {
    public static void main(String[] args) {
//        JFrame jFrame = new JFrame();
//        jFrame.setTitle("Draw Circle.");
//        jFrame.setSize(720, 480);
//        jFrame.getContentPane().add(new DrawTriangle());
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setResizable(false);

        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        Layer layer3 = new Layer();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();
        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape triangle3 = new Triangle();
        Shape rectangle1 = new Rectangle();
        Shape rectangle2 = new Rectangle();
        Shape rectangle3 = new Rectangle();
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape square3 = new Square();
        layer1.addShape(circle1);
        layer1.addShape(triangle1);
        layer1.addShape(rectangle1);
        layer1.addShape(square1);
        layer2.addShape(circle2);
        layer2.addShape(triangle2);
        layer2.addShape(rectangle2);
        layer2.addShape(square2);
        layer3.addShape(circle3);
        layer3.addShape(triangle3);
        layer3.addShape(rectangle3);
        layer3.addShape(square3);
        diagram.addLayer(layer1);
        diagram.addLayer(layer2);
        diagram.addLayer(layer3);
//        diagram.removeTriangle();
//        layer1.setVisible(false);
//        layer1.removeRectangle();
        diagram.printLayers();
    }
}
