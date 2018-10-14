package week5_6.graphical;

import javax.swing.*;
import java.awt.*;

public class DrawTriangle extends JPanel {
    public void paint(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int x[] = {100, 70, 130};
        int y[] = {50, 100, 100};
        graphics.fillPolygon(x, y, 3);
    }
}
