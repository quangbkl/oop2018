package week5_6.graphical;

import java.awt.*;

public class ColorManager {
    public static Color getColor(String nameColor) {
        if (nameColor.equalsIgnoreCase("Black")) return new Color(0, 0, 0);
        if (nameColor.equalsIgnoreCase("White")) return new Color(255, 255, 255);
        if (nameColor.equalsIgnoreCase("Red")) return new Color(255, 0, 0);
        if (nameColor.equalsIgnoreCase("Lime")) return new Color(0, 255, 0);
        if (nameColor.equalsIgnoreCase("Blue")) return new Color(0, 0, 255);
        if (nameColor.equalsIgnoreCase("Yellow")) return new Color(255, 255, 0);
        if (nameColor.equalsIgnoreCase("Cyan") || nameColor.equalsIgnoreCase("Aqua")) return new Color(0, 255, 255);
        if (nameColor.equalsIgnoreCase("Magenta") || nameColor.equalsIgnoreCase("Fuchsia")) return new Color(255, 0, 255);
        if (nameColor.equalsIgnoreCase("Silver")) return new Color(192, 192, 192);
        if (nameColor.equalsIgnoreCase("Gray")) return new Color(128, 128, 128);
        if (nameColor.equalsIgnoreCase("Maroon")) return new Color(128, 0, 0);
        if (nameColor.equalsIgnoreCase("Olive")) return new Color(128, 128, 0);
        if (nameColor.equalsIgnoreCase("Green")) return new Color(0, 128, 0);
        if (nameColor.equalsIgnoreCase("Purple")) return new Color(128, 0, 128);
        if (nameColor.equalsIgnoreCase("Teal")) return new Color(0, 128, 128);
        if (nameColor.equalsIgnoreCase("Navy")) return new Color(0, 0, 128);
        
        return new Color(0, 0, 0);
    }
}
