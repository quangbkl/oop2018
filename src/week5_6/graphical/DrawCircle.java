package week5_6.graphical;

import week4.task2.Circle;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JPanel {
    Circle circle;

    public DrawCircle(Circle circle) {
        this.circle = circle;
    }

    public DrawCircle() {
        this.circle = new Circle();
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.fillOval(100, 100, 30, 30);
        int x[] = {100, 70, 130};
        int y[] = {50, 100, 100};
        graphics.fillPolygon(x, y, 3);

    }
}
